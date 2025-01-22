import java.util.Scanner;
class FeeCalculator {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter total fee: ");
       double fee = sc.nextDouble();
       System.out.print("Enter discount percentage: ");
       double discountPercent = sc.nextDouble();
       double discount = (discountPercent/100) * fee;
       double discountedFee = fee-discount;
       System.out.println("The discount amount is INR " +discount+ " and final discounted fee is INR " +discountedFee);
   }
}
