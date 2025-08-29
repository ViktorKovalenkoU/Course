package temp.tempAI;

import java.io.*;

public class FileProcessor {
    public static void replaceJavaWithPython (String inputFilePath, String outputFilePath) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
                ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace("Java", "Python");
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("File successfully changed");
        } catch (IOException e) {
            System.out.println("File refactoring error: " + e.getMessage());
        }
    }
}
