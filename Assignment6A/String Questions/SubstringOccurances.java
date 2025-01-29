import java.util.*;
public class SubstringOccurances{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a Substring: ");
        String subStr = sc.nextLine();
        Occurances(str , subStr);
    }

    public static void Occurances(String str, String substr){
        Map<String, Integer> mp = new HashMap<>();

        for(int i=0 ;i < str.length() ;i++){
            for (int j = i+1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                
                mp.put(subStr, mp.getOrDefault(subStr, 0)+1);
            }
        }
        if(mp.get(substr) == null){
            System.out.println(substr + " " +  0);
            System.exit(0);
        }
        System.out.println(substr + " " + mp.get(substr));
    }
}