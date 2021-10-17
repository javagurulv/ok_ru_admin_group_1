package student_yuri_grigorov.lesson_9.level_5_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void addBookPositive() {
        BookReader bookReader = new BookReaderImpl();
        assertTrue(bookReader.addBook(new Book("Ian F. Darwin",  "Java Cookbook, 4th Edition")));
    }

    @Test
    public void addBookNegative() {
        BookReader bookReader = new BookReaderImpl();
        Book b = new Book("Ian F. Darwin",  "Java Cookbook, 4th Edition");
        bookReader.addBook(b);
        assertFalse(bookReader.addBook(b));
    }

    @Test
    public void addBookNoAuthor() {
        BookReader bookReader = new BookReaderImpl();
        Book b = new Book("",  "Java Cookbook, 4th Edition");
        bookReader.addBook(b);
        assertFalse(bookReader.addBook(b));
    }

    @Test
    public void addBookNoTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book b = new Book("Ian F. Darwin",  "");
        bookReader.addBook(b);
        assertFalse(bookReader.addBook(b));
    }
    @Test

    public void addBookNoAuthorNoTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book b = new Book("",  "");
        bookReader.addBook(b);
        assertFalse(bookReader.addBook(b));
    }

    @Test
    public void deleteBook() {
        BookReader bookReader = new BookReaderImpl();
        Book b = new Book("Ian F. Darwin",  "Java Cookbook, 4th Edition");
        bookReader.addBook(b);
        assertTrue(bookReader.deleteBook(b));
    }

    @Test
    public void deleteBookNegative() {
        BookReader bookReader = new BookReaderImpl();
        Book b = new Book("Darwin",  "Java Cookbook");
        assertFalse(bookReader.deleteBook(b));
    }

}
