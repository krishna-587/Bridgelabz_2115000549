import java.util.Scanner;
public class Handshake {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of students: ");
       int numberOfStudents = sc.nextInt();
       int possiblehandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
       System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + possiblehandshakes);
   }
}