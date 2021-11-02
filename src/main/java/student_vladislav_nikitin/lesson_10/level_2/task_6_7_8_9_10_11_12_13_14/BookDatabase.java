package student_vladislav_nikitin.lesson_10.level_2.task_6_7_8_9_10_11_12_13_14;

import java.util.List;
import java.util.Optional;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);

    void deleteByAuthor(String author);
    void deleteByTitle(String title);

    int countAllBooks();
}
