package student_sergey_egorichev.lesson_10.level_2.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public boolean delete(Book book) {
        if (this.bookList.remove(book)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: this.bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
