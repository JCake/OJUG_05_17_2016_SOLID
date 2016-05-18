package solutions.b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileNamesOutputer implements NamesOutputer {

    private final String fileName;

    public FileNamesOutputer(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void outputNames(List<String> names) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            names.forEach((name) -> {
                try {
                    writer.write(name);
                    writer.newLine();
                } catch (IOException ioe) {
                    throw new RuntimeException(ioe);
                }
            });
        } catch (IOException ioe){
            throw new RuntimeException(ioe);
        }
    }
}
