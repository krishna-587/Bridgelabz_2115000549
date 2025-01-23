import java.util.*;
public class LargestOfThree{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First number");
            int number1 = sc.nextInt();
            System.out.println("Enter Second number");
            int number2 = sc.nextInt();
            System.out.println("Enter Third number");
            int number3 = sc.nextInt();
            
            boolean flag = false;
           
            if(number1>number2 && number1>number3){
                flag = true;
                System.out.println("Is the first number the largest? "+flag);
                System.out.println("Is the second number the largest? "+!flag);
                System.out.println("Is the third number the largest? "+!flag);
            }
            else if(number2>number1 && number2>number3){
                flag = true;
                System.out.println("Is the first number the largest? "+!flag);
                System.out.println("Is the second number the largest? "+flag);
                System.out.println("Is the third number the largest? "+!flag);
            }
            else{
                flag = true;
                System.out.println("Is the first number the largest? "+!flag);
                System.out.println("Is the second number the largest? "+!flag);
                System.out.println("Is the third number the largest? "+flag);
            }
            sc.close();
        }
}