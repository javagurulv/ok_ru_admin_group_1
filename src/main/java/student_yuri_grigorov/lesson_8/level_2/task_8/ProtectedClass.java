package student_yuri_grigorov.lesson_8.level_2.task_8;

/**
 * Почему protected классы создавать нельзя?
 *
 * Потому что protected класс будет доступен в текущем пакете и во всех вложенных пакетах.
 * Однако концепции вложенных пакетов в Java не существует.
 */

public class ProtectedClass {

    private String title;
    private String author;


}
