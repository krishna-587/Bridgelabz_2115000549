
import java.util.*;
public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Character to Remove: ");
        char ch = sc.next().charAt(0);
        
        System.out.println("Modified String: "+ removeCharacter(str, ch));
    }

    public static String removeCharacter(String str, char ch) {
        String modifiedString = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch){
                modifiedString += str.charAt(i);
            }
        }
        return modifiedString;

    }
}
