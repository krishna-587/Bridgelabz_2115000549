public class Books {
    private String title;
    private String author;
    private int price;
    private boolean availability;

    public Books(String title ,String author , int price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public boolean borrow(){
        if(availability){
            availability = false;
            return true;
        }
        else{
            return false;
        }
    }
}
