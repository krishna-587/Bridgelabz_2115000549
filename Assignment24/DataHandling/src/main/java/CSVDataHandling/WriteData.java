package CSVDataHandling;
import com.opencsv.CSVWriter;

import java.io.FileWriter;

public class WriteData {
    public static void main(String[] args) {
        try(CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\employee.csv"))){
            writer.writeNext(new String[]{"ID", "Name", "Department", "Salary"});
            writer.writeNext(new String[]{"101", "Krishna", "IT", "900000"});
            writer.writeNext(new String[]{"102", "Gopal", "Cyber Security", "600000"});
            writer.writeNext(new String[]{"103", "Bob", "Finance", "400000"});
            writer.writeNext(new String[]{"104", "Oggy", "Sales", "300000"});
            writer.writeNext(new String[]{"105", "Doremon", "Marketing", "200000"});

            System.out.println("Data Written Successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
