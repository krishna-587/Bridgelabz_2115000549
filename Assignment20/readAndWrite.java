
import java.io.*;

public class readAndWrite {

    public static void main(String args[]) {
        String source = "source.txt";
        String destination = "dest.txt";

        try (FileInputStream fis = new FileInputStream(source); 
        FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        }
            catch(FileNotFoundException e){
            System.out.println("Error: Source file not found.");
             }
            catch(IOException e){
                System.out.println("Error reading/writing the file: " + e.getMessage());
        }
    }
}