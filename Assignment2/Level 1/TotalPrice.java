import java.util.Scanner;
class TotalPrice {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the unit price: ");
       double unitPrice = sc.nextDouble();
       System.out.print("Enter the quantity: ");
       int quantity = sc.nextInt();
       double totalPrice = unitPrice * quantity;
       System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
   }
}
