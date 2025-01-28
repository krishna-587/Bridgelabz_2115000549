import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp=sc.nextDouble();
        System.out.print("Enter the Speed of wind: ");
        double windSpeed=sc.nextDouble();
        Temperature  obj=new Temperature ();
        double windChill=obj.calculateWindChill(temp,windSpeed);
        System.out.println("WindChill Temperature is "+windChill);
        sc.close();
    }

    public double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
    
}
