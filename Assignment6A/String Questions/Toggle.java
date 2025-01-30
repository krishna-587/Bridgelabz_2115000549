import java.util.*;
public class Toggle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        toggle(str);

    }

    public static void toggle(String str) {
        String ans = "";
        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                ans += Character.toUpperCase(ch);
            }
            else{
                ans += Character.toLowerCase(ch);
            }
        }

        System.out.println("Toggled string is: "+ ans);
    }

    
}