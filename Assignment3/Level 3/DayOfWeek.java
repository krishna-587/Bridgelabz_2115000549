import java.util.Scanner;
public class DayOfWeek{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = sc.nextInt();
        System.out.println("Enter the day");
        int day = sc.nextInt();
        System.out.println("Enter the year");
        int year = sc.nextInt();
        //using the formula here
        int y0 = year - (14 - month) /12 ;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14-month)/12)-2;
        int numberOfDays = (day + x + 31*m0 / 12 ) % 7;

        System.out.println(numberOfDays);
    }
}