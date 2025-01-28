import java.util.*;
public class UnitConvertor3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        double Fahrenheit = sc.nextDouble();
        System.out.println(Fahrenheit + " Fahrenheit is " + convertFarhenheitToCelsius(Fahrenheit) + " Celsius.");

        System.out.print("Enter Celsius to convert to Fahrenheit: ");
        double Celsius = sc.nextDouble();
        System.out.println(Celsius + " Celsius is " + convertCelsiusToFarhenheit(Celsius) + " Fahrenheit.");

        System.out.print("Enter pounds to convert to kilogram: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilogram.");

        System.out.print("Enter kilogram to convert to pounds: ");
        double kilogram = sc.nextDouble();
        System.out.println(kilogram + " kilogram is " + convertKilogramsToPounds(kilogram) + " pounds.");

        System.out.print("Enter gallons to convert to liters: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

        System.out.print("Enter liters to convert to gallons: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
    }

    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    public static double convertPoundsToKilograms(double pounds){
        double pounds2kilograms = 0.453592;
        return pounds2kilograms * pounds;
    }

    public static double convertKilogramsToPounds(double kilogram){
        double kilograms2pounds = 2.20462; 
        return kilograms2pounds * kilogram;
    }

    public static double convertGallonsToLiters(double gallons){
        double gallons2liters = 3.78541;
        return gallons2liters * gallons;
    }

    public static double convertLitersToGallons(double liters){
        double liters2gallons = 0.264172; 
        return liters2gallons * liters;
    }
}
