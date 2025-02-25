package CSVDataHandling;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\file.csv"))){

            String[] line;
            reader.readNext();
            while((line = reader.readNext()) != null){
                if(Integer.parseInt(line[3]) > 80){
                    System.out.println(line[0] + " " + line[1] + " "+ line[2] + " " +line[3]);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
