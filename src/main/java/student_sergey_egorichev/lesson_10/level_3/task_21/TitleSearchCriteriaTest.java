package student_sergey_egorichev.lesson_10.level_3.task_21;

import org.junit.Assert;
import org.junit.Test;

public class TitleSearchCriteriaTest {
    @Test
    public void mathTest1 () {
        BookDatabase bdb = new BookDatabaseImpl();
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        bdb.save(book1);
        bdb.save(book2);

        SearchCriteria asc = new TitleSearchCriteria("title2");

        Assert.assertTrue(asc.match(book2));
    }

    @Test
    public void mathTest2 () {
        BookDatabase bdb = new BookDatabaseImpl();
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        bdb.save(book1);
        bdb.save(book2);

        SearchCriteria asc = new TitleSearchCriteria("title3");

        Assert.assertFalse(asc.match(book2));
    }

    @Test
    public void mathTest3 () {
        BookDatabase bdb = new BookDatabaseImpl();
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        bdb.save(book1);
        bdb.save(book2);

        SearchCriteria asc = new TitleSearchCriteria("title1");

        Assert.assertFalse(asc.match(book2));
    }
}
