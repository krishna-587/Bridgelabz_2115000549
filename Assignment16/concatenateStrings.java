import java.util.*;
public class concatenateStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter all strings: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }

        System.out.println("Concatenated String: "+ Concatenate(arr));
    }

    public static String Concatenate(String arr[]) {
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}
