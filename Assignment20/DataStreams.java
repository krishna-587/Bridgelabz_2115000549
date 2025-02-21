
import java.io.*;

class DataStreams {

    private static final String FILE_NAME = "students.dat"; 

    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "Krishna Gopal", 8.9),
            new Student(102, "Rahul Sharma", 7.8),
            new Student(103, "Neha Verma", 9.2)
        };

        writeStudentData(students);

        readStudentData();
    }

    private static void writeStudentData(Student[] students) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Student student : students) {
                dos.writeInt(student.getRollNumber());  
                dos.writeUTF(student.getName());    
                dos.writeDouble(student.getGpa());    
            }
            System.out.println("Student data successfully written to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    private static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("\nRetrieved Student Data:");
            while (dis.available() > 0) {  
                int rollNumber = dis.readInt();  
                String name = dis.readUTF();   
                double gpa = dis.readDouble();   
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}

class Student {

    private int rollNumber;
    private String name;
    private double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}
