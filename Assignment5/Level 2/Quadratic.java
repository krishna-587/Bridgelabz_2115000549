import java.util.*;
public class Quadratic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        double Roots[] = root(a, b, c);
        if(Roots.length == 0){
            System.out.println("No roots for this equation");
            System.exit(0);
        }
        System.out.print("The roots of the equation are: ");
        for(double num : Roots){
            System.out.print(num+ " ");
        }
        
    }

    public static double[] root(int a,int b,int c){
        double d = Math.pow(b, 2) + (4*a*c);
        double [] roots;
        if(d > 0){
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            roots = new double[]{root1,root2};
            return roots;
        }
        else if(d == 0){
            double root1 = (-b) / (2 * a);
            roots = new double[]{root1};
            return roots;
        }
        return roots = new double[]{0};
    }
}