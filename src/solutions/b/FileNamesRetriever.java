package solutions.b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileNamesRetriever implements NamesRetriever {

    private final String fileName;

    public FileNamesRetriever(String fileName){
        this.fileName = fileName;
    }

    @Override
    public List<String> retriveNames() {
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String nextLine = reader.readLine();
            while(nextLine != null) {
                names.add(nextLine);
                nextLine = reader.readLine();
            }
        } catch (IOException ioe){
            throw new RuntimeException(ioe);
        }
        return names;
    }
}
