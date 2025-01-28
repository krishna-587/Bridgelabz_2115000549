import java.util.*;
public  class CheckNumberType{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int ans = CheckNumber(n);
        System.out.println(ans);
        
    }
    
    public static int CheckNumber(int n){
        if(n==0){
            return 0;
        }
        else if(n>0){
            return 1;
        }
        else{
            return -1;
        }
    }
}