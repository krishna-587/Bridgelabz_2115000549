package CSVDataHandling;

import com.opencsv.CSVReader;

import javax.annotation.processing.Filer;
import java.io.FileReader;
import java.util.*;
class Student{
    String name;
    int age;
    int marks;
    int id;

    public Student(int id, String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.id = id;
    }

    public void displayData(){
        System.out.println("-----------------------");
        System.out.println("Id:- " + id);
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
        System.out.println("Marks:- " + marks);
    }
}

public class ConvertCSVDataToJavaObjects {
    public static void main(String[] args) {
        try(CSVReader reader = new CSVReader(new FileReader("C:\\Users\\user\\IdeaProjects\\DataHandling\\src\\main\\java\\CSVDataHandling\\studentdata.csv"))){

            List<Student> list = new ArrayList<>();
            String[] line;
            reader.readNext();
            while ((line = reader.readNext()) != null){
                list.add(new Student(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3])));
            }

            for(Student s : list){
                s.displayData();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
