import java.util.*;
public class Park {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1 of triangle");
        double side1=sc.nextInt();

        System.out.println("Enter side2 of triangle");
        double side2=sc.nextInt();

        System.out.println("enter side3 of triangle");
        int side3=sc.nextInt();

        int distance=5;
        double perimeter=(side1+side2+side3)/1000;
        double rounds = numberOfRounds(perimeter, distance);
        
        System.out.println("Total number of rounds an athlete needs to complete in 5km is : "+ rounds);
        
    }

    public static double numberOfRounds(double perimeter,int distance){
        double totalRounds=(distance/perimeter);
        return totalRounds;
    }
    
}
