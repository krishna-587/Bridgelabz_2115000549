
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
    private String name;
    private int age;
    private String studentId;
    private int physicsmarks;
    private int chemistrymarks;

    public Student(String name, int age, String studentId, int physicsmarks, int chemistrymarks){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.physicsmarks = physicsmarks;
        this.chemistrymarks = chemistrymarks;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    private double percentage(int physicsmarks , int chemistrymarks){
       return ((physicsmarks+chemistrymarks)/200.0) * 100; 
    }
}

public class GetClassInformation{
    public static void main(String[] args) throws Exception{

        // Accessing class, fields, methods and constructor of a predefined class like ArrayList.

        Class<?> clazz = Class.forName("java.util.ArrayList");

        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }


        // Accessing class, fields, methods, and constructor of a user-defined class (Student).

        Student student = new Student("Krishna", 21, "krish12", 	86, 92);
        Class<?> cls = student.getClass();

        Method method = cls.getDeclaredMethod("percentage", int.class, int.class);
        method.setAccessible(true);

        double result = (double)method.invoke(student , 86 , 92);
        System.out.println(result);


        Field field = cls.getDeclaredField("physicsmarks");
        field.setAccessible(true);

        System.out.println("Old physics marks: " + field.get(student));

        field.set(student, 96);

        System.out.println("New physics marks: " + field.get(student));

        Constructor<?> constructor = cls.getConstructor(String.class, int.class, String.class, int.class, int.class);
        
        Student student1 = (Student)constructor.newInstance("Gopal" , 21, "krish12" , 89, 98);
        student1.displayName();
    }
}