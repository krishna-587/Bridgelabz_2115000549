import java.io.*;

public class FilterStreams {
    public static void main(String[] args) {
        String sourceFile = "source.txt";  
        String destinationFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); 
                writer.newLine();
            }

            System.out.println("Conversion completed successfully. Check " + destinationFile);

        } catch (IOException e) {
            System.out.println("Error handling the file: " + e.getMessage());
        }
    }
}
