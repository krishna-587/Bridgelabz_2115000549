public class Course {

    static String instituteName;

    private String courseName;
    private int duration;
    private double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("The name of course is: " + courseName);
        System.out.println("The duration of course is: " + duration);
        System.out.println("The total fee of course is: " + fee);
        System.out.println("Institute Name is: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
