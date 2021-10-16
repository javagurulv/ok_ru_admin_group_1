package student_sergey_egorichev.lesson_10.level_2.task_12;

import org.junit.Assert;
import org.junit.Test;

public class BookDatabaseTests {


    @Test
    public void countAllBooksTest1 () {

        BookDatabase bdb = new BookDatabaseImpl();

        bdb.save(new Book("author1", "book1"));
        bdb.save(new Book("author2", "book2"));
        bdb.save(new Book("author1", "book3"));
        bdb.save(new Book("author3", "book4"));
        bdb.save(new Book("author4", "book2"));

        int expectedNumber = 5;

        Assert.assertTrue(bdb.countAllBooks() == expectedNumber);
    }

    @Test
    public void countAllBooksTest2 () {

        BookDatabase bdb = new BookDatabaseImpl();

        bdb.save(new Book("author1", "book1"));
        bdb.save(new Book("author2", "book2"));
        bdb.save(new Book("author1", "book3"));

        int expectedNumber = 5;

        Assert.assertFalse(bdb.countAllBooks() == expectedNumber);
    }

}
