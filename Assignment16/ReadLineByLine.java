import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine{
    public static void main(String[] args) throws IOException {
       
        try( BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}