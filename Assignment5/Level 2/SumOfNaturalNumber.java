import java.util.*;
public  class SumOfNaturalNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 1){
            System.exit(0);
        }
        SumOfNaturalNumber sn = new SumOfNaturalNumber();
        System.out.print("Sum of Natural Number using Recursion is: ");
        System.out.println(sn.Sum(number));
        System.out.print("Sum of Natural Number using formula is: ");
        System.out.println(sn.Sums(number));
    }

    public int Sum(int n){
        if(n==1){
            return 1;
        }

        return n+Sum(n-1);
    }

    public int Sums(int number) {
        return (number * (number + 1)) / 2;
    }
}