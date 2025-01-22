import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double mile = 1.6;
        double totalMiles = km/mile;
        System.out.println("The total miles is "+ totalMiles+" mile for the given "+km +"km");
    }
}
