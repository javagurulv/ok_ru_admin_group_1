package student_sergey_egorichev.lesson_10.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase {
    List<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        bookList.add(book);
        book.setId((long) bookList.size());
        return(book.getId());
    }

}
