import java.util.*;
public class reverseStringUsingStringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed String is : " + conversion(str));
       
    }

    public static String conversion(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
}