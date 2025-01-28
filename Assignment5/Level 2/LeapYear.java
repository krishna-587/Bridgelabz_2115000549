import java.util.*;
public class LeapYear{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LeapYear lp = new LeapYear();
        lp.check();
    }

    public void check(){
        int year = sc.nextInt();
        if(year < 1582){
            System.out.println("Not in Gregorian calendar");
            year = sc.nextInt();
        }
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("This Year is a Leap Year");
        }
        else{
            System.out.println("This Year is not a Leap Year");
        }
    }
}