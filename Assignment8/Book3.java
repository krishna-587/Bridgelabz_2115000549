public class Book3 {

    public double ISBN;
    protected String title;
    private String author;

    public Book3(double ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getName(){
        return author;
    }

    public void setName(String author){
        this.author = author;
    }

}

class EBook extends Book3{
    public EBook(double ISBN, String title, String author){
        super(ISBN, title, author);
    }
}
