import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{
    public int add(int a, int b){
        return a+b;
    } 
    public int subtract(int a , int b){
        return a-b;
    }

    public int multiply(int a , int b){
        return a*b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations mathOperations = new MathOperations();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Select type of operation to perform: ");
        System.out.println("1 : Addition ");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        int operation = sc.nextInt();
        Class<?> cls = MathOperations.class;
        int result = 0;
        switch (operation) {
            case 1:
            Method method1 = cls.getDeclaredMethod("add", int.class, int.class);
            method1.setAccessible(true);
            result = (int) method1.invoke(mathOperations, a, b);
            System.out.println("Result: " + result);
                break;

            case 2:
            Method method2 = cls.getDeclaredMethod("subtract", int.class, int.class);
            method2.setAccessible(true);
            result = (int) method2.invoke(mathOperations, a, b);
            System.out.println("Result: " + result);
                break;

            case 3:
            Method method3 = cls.getDeclaredMethod("multiply", int.class, int.class);
            method3.setAccessible(true);
            result = (int) method3.invoke(mathOperations, a, b);
            System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        
    }
}
