import java.util.*;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double Principle=sc.nextDouble();
		double Rate=sc.nextDouble();
		double Time=sc.nextDouble();
		System.out.println("The Simple Interest is "+(double)(Principle*Rate*Time)/100+" for Principal "+Principle+", Rate of Interest "+Rate+" and Time "+Time);
	}
}