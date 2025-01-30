import java.util.*;
public class SubstringOccurances{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the Substring: ");
        String subStr = sc.nextLine();
        
        countOccurances(str , subStr);
        sc.close();
    }

    public static void countOccurances(String str, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        System.out.println("Occurrences of \"" + subStr + "\": " + count);
    }
}