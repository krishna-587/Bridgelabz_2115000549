import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Longest word in a sentence is: ");
        System.out.println(largest(sentence));
    }

    public static String largest(String sentence){
        String [] str = sentence.split(" ");
        int arr[] = new int[str.length];
        int idx =0;
        for(String st : str){
            arr[idx++] = st.length();
        }
        Arrays.sort(arr);

        for(String st : str){
            if(st.length() == arr[arr.length-1]){
                return st;
            }
        }

        return "";
    }
}
