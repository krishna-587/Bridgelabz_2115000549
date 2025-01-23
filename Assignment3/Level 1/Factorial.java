import java.util.*;
public class  Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative integer.");
            sc.close();
            return;
        }

        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + n + " is " + factorial);

        sc.close();
    }
}