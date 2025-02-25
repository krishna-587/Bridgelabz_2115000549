package CSVDataHandling;

import com.opencsv.CSVReader;
import org.apache.commons.collections4.map.HashedMap;

import java.io.FileReader;
import java.util.*;

public class SortCSVRecords {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\employee.csv"))){
            String file[];
            List<String[]> employeeData = new ArrayList<>();
            reader.readNext();
            while((file = reader.readNext()) != null){
                employeeData.add(file);
            }

            employeeData.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

            System.out.println("\nTop 5 Highest Paid Employees:");
            System.out.println("ID\tName\tDepartment\tSalary");

            for (int i = 0; i < 5 ; i++) {
                String[] emp = employeeData.get(i);
                System.out.println(emp[0] + "\t" + emp[1] + "\t" + emp[2] + "\t" + emp[3]);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
