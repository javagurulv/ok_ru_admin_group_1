package student_vladislav_nikitin.lesson_10.level_4.task_23_24_25_26;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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

    Set<String> findUniqueAuthors();
    Set<String> findUniqueTitles();
    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    List<Book> getBooks();
}
