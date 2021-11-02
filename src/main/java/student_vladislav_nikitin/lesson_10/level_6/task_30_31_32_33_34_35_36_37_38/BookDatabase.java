package student_vladislav_nikitin.lesson_10.level_6.task_30_31_32_33_34_35_36_37_38;

import java.util.List;
import java.util.Map;
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

    Map<String, List<Book>> getAuthorToBooksMap();
    Map<String, Integer> getEachAuthorBookCount();

    List<Book> getBooks();
}
