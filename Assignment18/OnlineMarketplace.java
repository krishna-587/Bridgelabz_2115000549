import java.util.*;

abstract class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + " - $" + price;
    }
}

class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
}

class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }
}

class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();
    
    public void addProduct(T product) {
        products.add(product);
    }
    
    public List<T> getProducts() {
        return products;
    }
}

public class OnlineMarketplace {
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
    
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("The Great Gatsby", 15.99));
        bookCatalog.addProduct(new Book("1984", 12.49));

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 19.99));
        clothingCatalog.addProduct(new Clothing("Jeans", 39.99));

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartwatch", 199.99));
        gadgetCatalog.addProduct(new Gadget("Earbuds", 129.99));

        System.out.println("Before Discount:");
        bookCatalog.getProducts().forEach(System.out::println);
        clothingCatalog.getProducts().forEach(System.out::println);
        gadgetCatalog.getProducts().forEach(System.out::println);

        applyDiscount(bookCatalog.getProducts().get(0), 10);
        applyDiscount(clothingCatalog.getProducts().get(1), 15);
        applyDiscount(gadgetCatalog.getProducts().get(0), 20);

        System.out.println("\nAfter Discount:");
        bookCatalog.getProducts().forEach(System.out::println);
        clothingCatalog.getProducts().forEach(System.out::println);
        gadgetCatalog.getProducts().forEach(System.out::println);
    }
}
