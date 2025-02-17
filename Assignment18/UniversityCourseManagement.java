import java.util.*;

abstract class CourseType {
    private String courseName;
    
    public CourseType(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + courseName;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();
    
    public void addCourse(T course) {
        courses.add(course);
    }
    
    public List<T> getCourses() {
        return courses;
    }
}

public class UniversityCourseManagement {
    public static void displayCourses(List<? extends CourseType> courses) {
        courses.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Systems"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));

        System.out.println("Exam-Based Courses:");
        displayCourses(examCourses.getCourses());
        
        System.out.println("\nAssignment-Based Courses:");
        displayCourses(assignmentCourses.getCourses());
        
        System.out.println("\nResearch-Based Courses:");
        displayCourses(researchCourses.getCourses());
    }
}
