import java.util.Scanner;
public class Handshake1 {

    public static void MaximumHandShake(int n){
        double maxHand=(n*(n-1))/2;
        System.out.println("The number of possible handshakes : "+maxHand);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        MaximumHandShake(n);
    }
    
}