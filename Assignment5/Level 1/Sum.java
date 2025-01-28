import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Sum of natural number is : "+(sumNaturalNumber(num)));
        sc.close();

    }

    public static int  sumNaturalNumber(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    
}
