package student_sergey_egorichev.lesson_10.level_4.task_25;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class BookDatabaseImplTest {

    @Test
    public void findTest1() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);

        List<Book> expectedResult = new ArrayList<Book>(Arrays.asList(book1, book3));

        SearchCriteria searchCriteria = new AuthorSearchCriteria("author1");

        List<Book> b = bdb.find(searchCriteria);

        Assert.assertTrue(bdb.find(searchCriteria).equals(expectedResult));
    }

    @Test
    public void findTest2() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);

        List<Book> expectedResult = new ArrayList<Book>(Arrays.asList(book1, book3));

        SearchCriteria searchCriteria = new AuthorSearchCriteria("author3");

        List<Book> b = bdb.find(searchCriteria);

        Assert.assertFalse(bdb.find(searchCriteria).equals(expectedResult));
    }

    @Test
    public void findUniqueAuthorsTest1() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");
        Book book4 = new Book("author3", "title4");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<String> expectedResult = new HashSet<>(Arrays.asList("author1", "author2", "author3"));

        Assert.assertTrue(bdb.findUniqueAuthors().equals(expectedResult));
    }

    @Test
    public void findUniqueAuthorsTest2() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");
        Book book4 = new Book("author3", "title4");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<String> expectedResult = new HashSet<>(Arrays.asList("author1", "author3"));

        Assert.assertFalse(bdb.findUniqueAuthors().equals(expectedResult));
    }

    @Test
    public void findUniqueTitlesTest1() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");
        Book book4 = new Book("author3", "title4");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<String> expectedResult = new HashSet<>(Arrays.asList("title1", "title2", "title3", "title4"));

        Assert.assertTrue(bdb.findUniqueTitles().equals(expectedResult));
    }

    @Test
    public void findUniqueTitlesTest2() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");
        Book book4 = new Book("author3", "title4");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<String> expectedResult = new HashSet<>(Arrays.asList("title2", "title1", "title4", "title3"));

        Assert.assertTrue(bdb.findUniqueTitles().equals(expectedResult));
    }

    @Test
    public void findUniqueTitlesTest3() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title2");
        Book book4 = new Book("author3", "title4");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<String> expectedResult = new HashSet<>(Arrays.asList("title1", "title2", "title4"));

        Assert.assertTrue(bdb.findUniqueTitles().equals(expectedResult));
    }

    @Test
    public void findUniqueTitlesTest4() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title2");
        Book book4 = new Book("author3", "title4");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<String> expectedResult = new HashSet<>(Arrays.asList("title1", "title2", "title3", "title4", "title5"));

        Assert.assertFalse(bdb.findUniqueTitles().equals(expectedResult));
    }

    @Test
    public void findUniqueBooksTest1() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");
        Book book4 = new Book("author1", "title1");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<Book> expectedResult = new HashSet<>(Arrays.asList(book1, book2, book3));

        Assert.assertTrue(bdb.findUniqueBooks().equals(expectedResult));
    }

    @Test
    public void findUniqueBooksTest2() {
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        Book book3 = new Book("author1", "title3");
        Book book4 = new Book("author1", "title1");

        BookDatabase bdb = new BookDatabaseImpl();
        bdb.save(book1);
        bdb.save(book2);
        bdb.save(book3);
        bdb.save(book4);

        Set<Book> expectedResult = new HashSet<>(Arrays.asList(book1, book2, book4));

        Assert.assertFalse(bdb.findUniqueBooks().equals(expectedResult));
    }
}
