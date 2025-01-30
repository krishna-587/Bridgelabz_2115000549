import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));
    }

    public static boolean isPallindrome(String str){
        String temp = str;

        String newstr = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            newstr = newstr + str.charAt(i);
        }

        return (newstr.equals(temp)) ? true : false;
    }
}