import java.util.*;
public class divideN{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int noOfChocolates=sc.nextInt();
		int noOfChildren=sc.nextInt();
		int result1 = noOfChocolates/noOfChildren;
		int result2 = noOfChocolates%noOfChildren;
		System.out.println("The number of chocolates each child gets is "+result1+" and the number of remaining chocolates are "+ result2);
	}
}