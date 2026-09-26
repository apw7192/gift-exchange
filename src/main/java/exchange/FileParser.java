package exchange;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileParser {
    private static final String INPUT_FILENAME = "data/names.txt";
    private static final String OUTPUT_FILENAME = "data/gifters.txt";
    
    public static List<Person> loadData() throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILENAME));) {
        return reader.lines()
                    .map(line -> new Person(line.split(" ")[0], line.split(" ")[1]))
                    .collect(Collectors.toList());
        }
    }

    public static void writeData(Map<Person, Person> assignments) throws FileNotFoundException, IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(OUTPUT_FILENAME));) {
            assignments.forEach((k, v) -> writer.write(k + " -> " + v + "\n"));
        }
    }
}
