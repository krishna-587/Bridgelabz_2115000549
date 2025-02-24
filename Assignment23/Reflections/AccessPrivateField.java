
import java.lang.reflect.Field;

class Person{
    private int Age;

    public Person(int Age){
        this.Age = Age;
    }
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception{
        Person person = new Person(22);

        Class<?> cls = person.getClass();

        Field field = cls.getDeclaredField("Age");
        field.setAccessible(true);

        System.out.println("Old age : " + field.get(person));

        field.set(person, 23);

        System.out.println("New age : " + field.get(person));
    }
}
