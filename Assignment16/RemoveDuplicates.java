import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("After removing duplicates: " + duplicates(str));

    }

    public static String duplicates(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}