import java.util.*;
public class DistanceInFeet {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int differenceInFeet=sc.nextInt();
		double differenceInYard=(double)differenceInFeet/3;
		System.out.println("Dist. in yard is "+differenceInYard+" and in miles is "+(double)differenceInYard/1760);
	}
}