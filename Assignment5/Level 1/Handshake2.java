import java.util.Scanner;
public class Handshake2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of Students");
        int n=sc.nextInt();
        double maxHand=(n*(n-1))/2;
        System.out.println("maximum number of possible handshakes are: "+maxHand);
        
    }
    
}
