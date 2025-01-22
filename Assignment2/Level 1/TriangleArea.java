import java.util.Scanner;
public class TriangleArea {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the base of the triangle: ");
       double base = sc.nextDouble();
       System.out.print("Enter the height of the triangle: ");
       double height = sc.nextDouble();
       double areaInches = 0.5 * base * height;
       double areaCentimeters = areaInches * 6.4516;
       System.out.println("The area of the triangle is " + areaInches + " square inches or " + areaCentimeters + " square centimeters.");
   }
}
