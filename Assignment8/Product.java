public class Product {
    static int totalProducts = 0;
    private String productName;
    private double price;


    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("The name of product is: " + productName);
        System.out.println("The price of product is: " + price);
    }

    public static void displayTotalProducts(){
        System.out.println("Total products are: "+ totalProducts);
    }
}
