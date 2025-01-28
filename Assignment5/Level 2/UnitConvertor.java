import java.util.*;
public class UnitConvertor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter kilometers to convert to miles: ");
        double km = sc.nextDouble();
        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");
        
        System.out.print("Enter miles to convert to kilometers: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

        System.out.print("Enter meters to convert to feet: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMeterToFeet(meters) + " feet.");

        System.out.print("Enter feet to convert to meters: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToMeter(feet) + " meters.");
        

    }

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMeterToFeet(double meter) {
        double meters2feet = 3.28084;
        return meter * meters2feet;
    }
    public static double convertFeetToMeter(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}