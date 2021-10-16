package student_sergey_egorichev.lesson_10.level_2.task_13;

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

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book: this.bookList) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }

        if (!result.isEmpty()) {
            return result;
        } else {
            return null;
        }
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book: this.bookList) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }

        if (!result.isEmpty()) {
            return result;
        } else {
            return null;
        }
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> deleteList = new ArrayList<>();

        for (Book book: findByAuthor(author)) {
            deleteList.add(book);
        }

        if (!deleteList.isEmpty()) {
            for (Book book: deleteList) {
                this.bookList.remove(book);
            }
        }
    }
}
