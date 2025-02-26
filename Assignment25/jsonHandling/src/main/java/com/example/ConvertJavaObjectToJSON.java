package JSONDataHandling;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

class Car{
    String name;
    int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ConvertJavaObjectToJSON {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("BMW", 100000);

            String jsonString = objectMapper.writeValueAsString(car);

            System.out.println(jsonString);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
