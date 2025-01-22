import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance: ");
        double distanceFromToVia = sc.nextDouble();

        System.out.print("Enter the distance from: ");
        double distanceViaToFinalCity = sc.nextDouble();

        System.out.print("Enter the time taken from via: ");
        int hoursFromToVia = sc.nextInt();
        int minutesFromToVia = sc.nextInt();
        
        System.out.print("Enter the time taken from final: ");
        int hoursViaToFinalCity = sc.nextInt();
        int minutesViaToFinalCity = sc.nextInt();

        int timeFromToVia = (hoursFromToVia * 60) + minutesFromToVia;
        int timeViaToFinalCity = (hoursViaToFinalCity * 60) + minutesViaToFinalCity;

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("Travel details for " + name + ":");
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime / 60 + " hours and " + totalTime % 60 + " minutes");
    }
}