import java.util.*;

public class BookApi {
    static List<String> books = new ArrayList<>();

    public static String getBooks() {
        return books.toString();
    }

    public static void addBook(String title) {
        books.add(title);
    }

    public static void main(String[] args) {
        addBook("1984");
        addBook("Clean Code");
        System.out.println("All Books: " + getBooks());
    }
}
