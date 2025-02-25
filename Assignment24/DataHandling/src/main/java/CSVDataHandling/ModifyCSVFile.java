package CSVDataHandling;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSVFile {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\employee.csv"));
            CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\modifyEmployee.csv"))){

            String [] line;
            while((line = reader.readNext()) != null){
                if(line[2].equals("IT")){
                    int salary = Integer.parseInt(line[3]);
                    int newSalary = salary +(int) (1.10 * salary);
                    line[3] = String.valueOf(newSalary);
                }
                writer.writeNext(line);
            }

            System.out.println("Data Modified Successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
