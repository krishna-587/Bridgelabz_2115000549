
import java.lang.reflect.Field;

class Configuration{
    private static String API_KEY = "sk-1234567890abcdef";
}

public class AccessandModifyStaticFields {
    public static void main(String[] args) throws Exception{
        Configuration config = new Configuration();
        Class<?> cls = config.getClass();

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Old api key : " + field.get(config));

        field.set(config, "AIzaSyDUMMYKEY123");

        System.out.println("New api key : " + field.get(config));
    }
}
