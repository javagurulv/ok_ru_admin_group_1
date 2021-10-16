package student_sergey_egorichev.lesson_10.level_3.task_22;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
