package student_vladislav_nikitin.lesson_10.level_3.task_15_16_17_18_19_20_21_22;

import java.util.List;
import java.util.Optional;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);

    List<Book> find(SearchCriteria searchCriteria);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);

    void deleteByAuthor(String author);
    void deleteByTitle(String title);

    int countAllBooks();

    List<Book> getBooks();
}
