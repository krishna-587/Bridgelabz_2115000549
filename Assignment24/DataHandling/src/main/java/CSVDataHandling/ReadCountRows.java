package CSVDataHandling;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class ReadCountRows {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\employee.csv"))){
            String line[];
            int i = 0 , count = 0;
            while((line = reader.readNext()) != null){
                if(i != 0){
                    count++;
                }
                i++;
            }

            System.out.println("Total number of rows in the CSV file is: " + count);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
