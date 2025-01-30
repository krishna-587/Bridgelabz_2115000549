import java.util.*;
public class CountVowelConsonents{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int arr[] = count(str);
        System.out.println("Total vowels are: "+ arr[0]+" and total consonents are: "+ arr[1]);
    }

    public static int[] count(String str){
        int vowel =0;
        int Consonent = 0;

        for(char ch : str.toCharArray()){
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u'){
                vowel++;
            }
            else{
                Consonent++;
            }

        }
        return new int[]{vowel, Consonent};
    }
}