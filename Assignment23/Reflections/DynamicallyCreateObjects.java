
import java.lang.reflect.Constructor;

class Student{
    private String name;

    public Student(String name){
        this.name = name;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class DynamicallyCreateObjects {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Student.class;

        Constructor constructor = cls.getConstructor(String.class);
        Student student =(Student) constructor.newInstance("Krishna");
        student.displayName();
    }
}
