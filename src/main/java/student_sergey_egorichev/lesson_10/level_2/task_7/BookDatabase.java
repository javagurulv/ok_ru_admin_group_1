package student_sergey_egorichev.lesson_10.level_2.task_7;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long BookId);
}

