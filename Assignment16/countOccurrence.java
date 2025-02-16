import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class countOccurrence{

    public static void main(String[] args) {
        String filePath = "test.txt";  
        System.out.println("Enter the word to find Occurence");
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(str)) {
                    count++;
                }
            }
            System.out.println("Occurence of Word " + str + " is :- " + count );
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}