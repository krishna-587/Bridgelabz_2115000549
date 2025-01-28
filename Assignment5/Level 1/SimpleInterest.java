import java.util.*;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int Principal = sc.nextInt();
        System.out.print("Enter the Rate of interest: ");
        int Rate = sc.nextInt();
        System.out.print("Enter the time: ");
        int Time = sc.nextInt();
        SI(Principal,Rate,Time);
    }

    public static void SI(int principal , int time, int rate){
        double simpleInterest = (double)(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
}