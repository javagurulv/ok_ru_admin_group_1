package student_vladislav_nikitin.lesson_9.level_5.task_13_14_15_16_17_18;

import java.util.List;
import java.util.Optional;

interface BookReader {

    boolean add(Book book);
    boolean remove(Book book);
    Optional<Book> fullSearch(String author, String title);
    List<Book> searchByAuthor(String author);
    List<Book> searchByAuthorPrefix(String authorPrefix);
    String[] show();
    boolean isEmptyInformation(Book book);

}
