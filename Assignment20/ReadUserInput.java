import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) {
        String fileName = "userInfo.txt"; 

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) { 

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("-------------------------\n");

            System.out.println("User information saved successfully to " + fileName);

        } catch (IOException e) {
            System.out.println("Error while handling the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a numeric value.");
        }
    }
}
