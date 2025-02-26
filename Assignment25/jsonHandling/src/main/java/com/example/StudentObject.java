package JSONDataHandling;

import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Krishna");
        jsonObject.put("Age", 23);
        jsonObject.put("Subjects", new JSONArray(Arrays.asList("DBMS", "Computer Network", "Java")));

        System.out.println(jsonObject.toString(4));
    }
}
