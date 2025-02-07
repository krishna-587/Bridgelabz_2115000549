// Person
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}


class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main Class to Test Hierarchical Inheritance
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Krishna", 18, "Computer");
        Student student = new Student("Kunal", 19, 10);
        Staff staff = new Staff("Mr. Gopal", 20, "Administration");

        System.out.println("Teacher Details");
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        System.out.println("Student Details");
        student.displayInfo();
        student.displayRole();
        System.out.println();

        System.out.println("Staff Details");
        staff.displayInfo();
        staff.displayRole();
    }
}
