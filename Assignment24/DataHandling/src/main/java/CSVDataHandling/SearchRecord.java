package CSVDataHandling;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String name = sc.nextLine();
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\employee.csv"))){
            String [] line;
            boolean flag = false;
            while((line = reader.readNext()) != null){
                if((line[1].toLowerCase()).equals(name)){
                    System.out.println("ID: " + line[0] + ", Name: " + line[1] + ", Department: " + line[2] + ", Salary: " + line[3]);
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.println("No such employee found");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
