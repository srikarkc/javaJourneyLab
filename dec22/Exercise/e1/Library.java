import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Thinking Fast and Slow", "Daniel Kahneman", 1234);
        bookList.add(book1);
        System.out.println(bookList);
    }
}