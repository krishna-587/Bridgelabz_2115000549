import java.util.Scanner;
public class HeightConversion {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your height in centimeter: ");
       double height = sc.nextDouble();
       double Inches = height/2.54;
       int feet = (int) (Inches/12);
       double inches = Inches%12;
       System.out.println("Your Height in cm is " +height + " while in feet is " +feet+ " and inches is " +inches);
   }
}
