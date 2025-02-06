import java.util.*;

class School {

    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }
}

class Student {
    private String name;
    private int studentId;
    private List<Course> courses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void viewEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("  - " + student.getName());
        }
    }
}

public class School_Management {
    public static void main(String[] args) {

        School school = new School("Christ the king high school");

        Student student1 = new Student("Krishna", 101);
        Student student2 = new Student("Vikash", 102);

        school.addStudent(student1);
        school.addStudent(student2);

        Course web = new Course("Web technologies");
        Course java = new Course("Java");

        student1.enrollInCourse(web);
        student1.enrollInCourse(java);
        student2.enrollInCourse(web);

        school.displayStudents();

        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        web.viewEnrolledStudents();
        java.viewEnrolledStudents();
    }
}