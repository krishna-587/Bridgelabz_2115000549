import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        reverse(str);

    }
    public static void reverse(String str){
        char arr[] = str.toCharArray();
        String newStr = "";
        for (int i = arr.length-1; i >= 0; i--){
            newStr += arr[i];
        }

        System.out.println("Reversed String is: "+ newStr);
    }
}