import java.util.*;
public class SmallestOf3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int number1 = sc.nextInt();
        System.out.println("Enter Second number");
        int number2 = sc.nextInt();
        System.out.println("Enter Third number");
        int number3 = sc.nextInt();

        if(number1<number2 && number1<number3){
            System.out.println("Is the first number the smallest ? Yes");
        }
        else{
            System.out.println("Is the first number the smallest ? No");
        }
        sc.close();
    }
}