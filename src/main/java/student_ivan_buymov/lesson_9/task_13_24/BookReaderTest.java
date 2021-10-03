package student_ivan_buymov.lesson_9.task_13_24;

import junit.framework.TestCase;
import org.junit.Test;

public class BookReaderTest extends TestCase {

    public void testAddBook() {
        var r = new BookReaderImpl();
        var toAdd = new Book("test book", "test author");
        var result = r.addBook(toAdd);
        assert r.getBook(toAdd).get().name == toAdd.name;
        assert result == true;

        result = r.addBook(new Book("", "test author"));
        assert result == false;
        result = r.addBook(new Book("test name", ""));
        assert result == false;
    }

    public void testDeleteBook() {
        var r = new BookReaderImpl();
        var toAdd = new Book("test book", "test author");
        r.addBook(toAdd);
        var res = r.deleteBook(toAdd);
        assert res == true;
        assert r.deleteBook(new Book("not exist", "not exist")) == false;
    }

    public void testListBooks() {
        var r = new BookReaderImpl();
        assert r.listBooks().isEmpty() == true;
        r.addBook(new Book("test book2", "test author2"));
        r.addBook(new Book("test book2", "test author2"));
        assert r.listBooks().size() == 2;
    }

    public void testGetBook() {
        var r = new BookReaderImpl();
        var book = new Book("test", "test");
        r.addBook(book);
        assert book == r.getBook(book).get();

    }

    public void testFindByAuthor() {
        var r = new BookReaderImpl();
        r.addBook(new Book("test", "author1"));
        r.addBook(new Book("test", "author2"));
        r.addBook(new Book("test", "other"));
        var foundBook = r.findByAuthor("auth");
        assert foundBook.size() == 2;
    }

    public void testFindByName() {
        var r = new BookReaderImpl();
        r.addBook(new Book("name1", "author1"));
        r.addBook(new Book("name2", "author2"));
        r.addBook(new Book("other", "other"));
        var foundBook = r.findByName("name");
        assert foundBook.size() == 2;
    }

    public void testMarkAsRead() {
        var r = new BookReaderImpl();
        var book = new Book("test", "author");
        r.addBook(book);
        assert !r.getBook(book).get().alreadyRead;
        r.markAsRead(book);
        assert r.getBook(book).get().alreadyRead;
    }

    public void testListAlreadyRead() {
        var r = new BookReaderImpl();
        var book = new Book("test", "author");
        r.addBook(book);
        r.markAsRead(book);
        assert  r.listAlreadyRead().size() == 1;
    }

    public void testListNotRead() {
        var r = new BookReaderImpl();
        var book = new Book("test", "author");
        r.addBook(book);
        assert  r.listNotRead().size() == 1;
        r.markAsRead(book);
        assert r.listNotRead().size() == 0;

    }
}