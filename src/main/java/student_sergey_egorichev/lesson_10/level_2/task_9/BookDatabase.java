package student_sergey_egorichev.lesson_10.level_2.task_9;

import java.util.Optional;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long BookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
}

