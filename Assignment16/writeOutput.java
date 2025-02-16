import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class writeOutput {
    public static void main(String[] args) {
        String filePath = "file1.txt";  

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath, true)) {  

            String userInput;
            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                userInput = bufferedReader.readLine();

                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }

                fileWriter.write(userInput + System.lineSeparator());
            }

            System.out.println("Input has been written to " + filePath);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
