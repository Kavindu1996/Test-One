
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {

        User user = new User("Farhan Hasin Junior", "1995-01-31");
        Book carmila = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook dracula= new AudioBook("A", "B", 3000);
        Ebook jeeves = new Ebook("Harry", "Potter", 380, "PDF");


System.out.println(jeeves.toString());


    }
}