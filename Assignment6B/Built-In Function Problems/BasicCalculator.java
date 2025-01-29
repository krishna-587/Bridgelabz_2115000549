import java.util.*;
public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the type of operation to be performed: ");
        char operation = sc.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println("The addition of "+ num1+" and " + num2 + " is: "+ addition(num1, num2));
                break;
            case '-':
                System.out.println("The subtraction of "+ num1+" and " + num2 + " is: "+ subtraction(num1, num2));
                break;
            case '*':
                System.out.println("The multiplication of "+ num1+" and " + num2 + " is: "+ multiplication(num1, num2));
                break;
            case '/':
                System.out.println("The division of "+ num1+" and " + num2 + " is: "+ division(num1, num2));
                break;
            default:
                System.out.println("Not a valid operation");
        }
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1/num2;
    }
}
