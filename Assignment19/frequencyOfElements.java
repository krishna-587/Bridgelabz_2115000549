import java.util.*;

public class frequencyOfElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        frequency(list);
    }

    public static void frequency(List<String> list){
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(int i =0 ; i < list.size() ; i++){
            frequencyMap.put(list.get(i), frequencyMap.getOrDefault(list.get(i), 0)+1);
        }

        for(String key : frequencyMap.keySet()){
            System.out.println(key + " = " + frequencyMap.get(key));
        }
    }
}
