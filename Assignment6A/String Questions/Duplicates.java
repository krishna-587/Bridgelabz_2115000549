import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int Freq[] = freq(str);
        String modifiedString  = removeDuplicate(Freq , str);
        if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z'){
            System.out.println("Modified String is: "+ modifiedString);
            System.exit(0);
        }
        System.out.println("Modified String is: "+ modifiedString.toUpperCase());
    }

    public static int[] freq(String str) {
        str =  str.toLowerCase();
        int Freq[] = new int[26];
        char chr []= str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            Freq[chr[i] - 'a']++;
        }
        for (int ele : Freq) {
            System.out.print(ele + " ");
        }
        return Freq;
    }

    public  static String removeDuplicate(int[] Freq , String str) {
        str =  str.toLowerCase();
        String modifiedString = "";

        for(int i = 0; i < str.length() ; i++){
            if(Freq[(str.charAt(i)) - 'a'] > 0){
                modifiedString += str.charAt(i);
                Freq[(str.charAt(i)) - 'a'] = 0;
            }
        }
        return modifiedString;
    }
}
