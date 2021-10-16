package student_sergey_egorichev.lesson_10.level_4.task_25;

import org.junit.Assert;
import org.junit.Test;

public class AndSearchCriteriaTest {
    @Test
    public void mathTest1 () {
        Book book2 = new Book("author2", "title2");

        SearchCriteria sc1 = new AuthorSearchCriteria("author2");
        SearchCriteria sc2 = new TitleSearchCriteria("title2");

        SearchCriteria asc = new AndSearchCriteria(sc1, sc2);

        Assert.assertTrue(asc.match(book2));
    }

    @Test
    public void mathTest2 () {
        Book book2 = new Book("author2", "title2");

        SearchCriteria sc1 = new AuthorSearchCriteria("author2");
        SearchCriteria sc2 = new TitleSearchCriteria("title1");

        SearchCriteria asc = new AndSearchCriteria(sc1, sc2);

        Assert.assertFalse(asc.match(book2));
    }

    @Test
    public void mathTest3 () {
        Book book2 = new Book("author2", "title2");

        SearchCriteria sc1 = new AuthorSearchCriteria("author1");
        SearchCriteria sc2 = new TitleSearchCriteria("title1");

        SearchCriteria asc = new AndSearchCriteria(sc1, sc2);

        Assert.assertFalse(asc.match(book2));
    }
}
