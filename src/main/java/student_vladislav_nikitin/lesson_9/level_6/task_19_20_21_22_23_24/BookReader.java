package student_vladislav_nikitin.lesson_9.level_6.task_19_20_21_22_23_24;

import java.util.List;
import java.util.Optional;

interface BookReader {

    boolean add(Book book);
    boolean remove(Book book);
    Optional<Book> fullSearch(String author, String title);
    List<Book> searchByAuthor(String author);
    List<Book> searchByAuthorPrefix(String authorPrefix);
    List<Book> searchByTitle(String title);
    List<Book> searchByTitlePrefix(String titlePrefix);
    boolean setRead(Book book);
    boolean setUnread(Book book);
    String[] show();
    String[] showRead();
    String[] showUnread();
    boolean isEmptyInformation(Book book);

}
