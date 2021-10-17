package student_yuri_grigorov.lesson_9.level_5_6;

import java.util.List;

public interface BookReader {

    boolean addBook(Book b);

    boolean deleteBook(Book b);

    boolean markAsRead(Book b);

    boolean markAsUnRead(Book b);

    List<Book> getBooksByAuthor(String author);

    List<Book> getBooksByTitle(String title);

    List<Book> getReadBooks();

    List<Book> getUnReadBooks();

    String[] toStringArray();
}
