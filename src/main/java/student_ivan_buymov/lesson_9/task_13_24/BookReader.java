package student_ivan_buymov.lesson_9.task_13_24;

import java.util.List;
import java.util.Optional;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    List<Book> listBooks();

    void printListBooks();

    Optional<Book> getBook(Book book);

    List<Book> findByAuthor(String author);

    List<Book> findByName(String name);

    boolean markAsRead(Book book);

    List<Book> listAlreadyRead();

    List<Book> listNotRead();

}