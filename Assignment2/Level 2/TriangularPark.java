import java.util.*;
public class  TriangularPark{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double side1=sc.nextDouble();
		double side2=sc.nextDouble();
		double side3=sc.nextDouble();
		System.out.println("The total number of rounds the athlete will run is "+((double)5000/(side1+side2+side3))+" to complete 5 km");
	}
}