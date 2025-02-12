class Node {
    String movieTitle;
    String Director;
    int yearOfRelease;
    int Rating;
    Node next;
    Node prev;

    public Node(String movieTitle, String Director, int yearOfRelease, int Rating) {
        this.movieTitle = movieTitle;
        this.Director = Director;
        this.yearOfRelease = yearOfRelease;
        this.Rating = Rating;
        this.next = null;
        this.prev = null;
    }
}

public class Movie_Management_System {
    Node head = null;
    Node tail = null;

    public void addMovieAtBegin(String movieTitle, String Director, int yearOfRelease, int Rating) {
        Node n = new Node(movieTitle, Director, yearOfRelease, Rating);
        if (head == null) {
            head = tail = n;  
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void addMovieAtLast(String movieTitle, String Director, int yearOfRelease, int Rating) {
        Node n = new Node(movieTitle, Director, yearOfRelease, Rating);
        if (head == null) {
            head = tail = n;  
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;  
    }

    public void addMovieAtPosition(String movieTitle, String Director, int yearOfRelease, int Rating, int pos) {
        Node n = new Node(movieTitle, Director, yearOfRelease, Rating);
        if (pos == 1 || head == null) {
            addMovieAtBegin(movieTitle, Director, yearOfRelease, Rating);
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }

        n.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = n;
        } else {
            tail = n;  
        }
        temp.next = n;
        n.prev = temp;
    }

    public void removeMovie(String movieTitle) {
        if (head == null) {
            System.out.println("No data");
            return;
        }

        if (head.movieTitle.equals(movieTitle)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;  
            }
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.movieTitle.equals(movieTitle)) {
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                temp.prev.next = temp.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }

    public void searchData(String Director, int Rating) {
        if (head == null) {
            System.out.println("No data");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.Director.equals(Director) && temp.Rating == Rating) {
                System.out.println("Searched data is: ");
                System.out.println("Movie Title: " + temp.movieTitle);
                System.out.println("Director: " + temp.Director);
                System.out.println("Year of Release: " + temp.yearOfRelease);
                System.out.println("Rating: " + temp.Rating);
                System.out.println("--------------------------");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }

    public void displayDetails() {
        if (head == null) {
            System.out.println("No movie records to display.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Movie Title: " + temp.movieTitle);
            System.out.println("Director: " + temp.Director);
            System.out.println("Year of Release: " + temp.yearOfRelease);
            System.out.println("Rating: " + temp.Rating);
            System.out.println("----------------------------");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Movie_Management_System movie = new Movie_Management_System();

        movie.addMovieAtBegin("War", "krishna", 2025, 9);
        movie.addMovieAtBegin("You", "Divyashu", 2026, 8);
        movie.addMovieAtLast("Interstellar", "Vivek", 2022, 6);
        movie.addMovieAtPosition("Bad Boys", "Kunal", 2023, 7, 2);
        
        movie.removeMovie("You");

        movie.searchData("krishna", 9);
        movie.displayDetails();
    }
}
