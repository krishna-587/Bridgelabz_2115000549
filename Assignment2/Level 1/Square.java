import java.util.Scanner;
public class Square {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the perimeter: ");
       double perimeter = sc.nextDouble();
       double side = perimeter / 4;
       System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
   }
}
