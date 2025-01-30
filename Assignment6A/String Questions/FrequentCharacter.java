
import java.util.*;

public class FrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Freq(str);

    }

    public static void Freq(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int max = freq[0];
        int idx = 0;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                idx = i;
            }
        }
        System.out.println("Most Frequent Character: "+  (char)( idx + 'a'));
    }
}
