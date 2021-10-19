package student_sergey_egorichev.lesson_11.level_2.task_17;


/**
 * Exception - это checked исключение, которое мы должны перехватывать где-то в коде, иначе код
 * не будет компилироваться. Что поможет нам гарантировать то что исключение при неправильных правах доступа
 * не будет пропущено, а будет обработано согласно требованиям.
 */
class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}
