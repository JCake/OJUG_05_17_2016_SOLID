package problems.b;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Processor {

    public static void main(String[] args){
        Processor processor = new Processor();
        processor.process();
    }

    public void process() {

        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String nextLine = reader.readLine();
            while(nextLine != null) {
                names.add(nextLine);
                nextLine = reader.readLine();
            }
        } catch (IOException ioe){
            throw new RuntimeException(ioe);
        }

        List<String> updatedNames = names.stream().filter((name) -> {
          return !name.startsWith("J") && !name.startsWith("K");
        }).sorted().collect(Collectors.toList());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            updatedNames.forEach((name) -> {
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
