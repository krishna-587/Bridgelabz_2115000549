import java.lang.reflect.*;
import java.util.*;

class User {
    public String name;
    public int age;
}

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            if (properties.containsKey(field.getName())) {
                field.setAccessible(true);
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Krishna");
        map.put("age", 23);

        User user = toObject(User.class, map);
        System.out.println(user.name + ", " + user.age);
    }
}
