import java.util.*;
public  class UnitConvertor2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter yards to convert to feet: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
        
        System.out.print("Enter feet to convert to yards: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        System.out.print("Enter meters to convert to inches: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters is " + convertMeterToInches(meters) + " inches.");

        System.out.print("Enter inch to convert to meters: ");
        double inch = sc.nextDouble();
        System.out.println(inch + " feet is " + convertInchesToMeter(inch) + " meters.");

        System.out.print("Enter inches to convert to centimeters: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " feet is " + convertInchesToCentimeter(inches) + " centimeters.");
        

    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMeterToInches(double meter) {
        double meters2inches = 39.3701;
        return meter * meters2inches;
    }
    public static double convertInchesToMeter(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCentimeter(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;

    }
}