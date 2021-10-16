package student_sergey_egorichev.lesson_10.level_3.task_22;

import org.junit.Assert;
import org.junit.Test;

public class YearOfIssueSearchCriteriaTest {
    @Test
    public void mathTest1 () {
        BookDatabase bdb = new BookDatabaseImpl();
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        book1.setYearOfIssue("1998");
        book2.setYearOfIssue("1987");

        bdb.save(book1);
        bdb.save(book2);

        SearchCriteria asc = new YearOfIssueSearchCriteria("1987");

        Assert.assertTrue(asc.match(book2));
    }

    @Test
    public void mathTest2 () {
        BookDatabase bdb = new BookDatabaseImpl();
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        book1.setYearOfIssue("1998");
        book2.setYearOfIssue("1987");

        bdb.save(book1);
        bdb.save(book2);

        SearchCriteria asc = new YearOfIssueSearchCriteria("1872");

        Assert.assertFalse(asc.match(book2));
    }

    @Test
    public void mathTest3 () {
        BookDatabase bdb = new BookDatabaseImpl();
        Book book1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title2");
        book1.setYearOfIssue("1998");
        book2.setYearOfIssue("1987");

        bdb.save(book1);
        bdb.save(book2);

        SearchCriteria asc = new YearOfIssueSearchCriteria("1998");

        Assert.assertFalse(asc.match(book2));
    }
}
