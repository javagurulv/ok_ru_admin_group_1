package student_sergey_egorichev.lesson_10.level_4.task_24;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
    List<Book> find(SearchCriteria searchCriteria);
    Set<String> findUniqueAuthors();
    Set<String> findUniqueTitles();
}

