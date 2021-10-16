package student_sergey_egorichev.lesson_10.level_2.task_7;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookList = new ArrayList<>();
    private Long lastId = 0L;

    @Override
    public Long save(Book book) {
        this.lastId++;
        bookList.add(book);
        book.setId(this.lastId);
        return(book.getId());
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book: this.bookList) {
            if (book.getId().equals(bookId)) {
                this.bookList.remove(book);
                return true;
            }
        }
        return false;
    }
}
