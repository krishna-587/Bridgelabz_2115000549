package CSVDataHandling;

import com.opencsv.CSVReader;
import com.opencsv.bean.util.OpencsvUtils;

import java.io.FileReader;

public class ReadCSV {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\file.csv"))){
            String[] line;
            while((line = reader.readNext()) != null){
                System.out.println(line[0]+ " " + line[1] + " "+ line[2] + " " +line[3]);
            }
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
