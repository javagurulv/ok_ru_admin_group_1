package student_sergey_egorichev.lesson_10.level_3.task_20;

import java.util.List;
import java.util.Optional;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long BookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    int countAllBooks();
    void deleteByAuthor(String author);
    void deleteByTitle(String title);
}

