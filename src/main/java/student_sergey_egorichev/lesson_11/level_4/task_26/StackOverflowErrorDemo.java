package student_sergey_egorichev.lesson_11.level_4.task_26;

public class StackOverflowErrorDemo {

    public static void someMethod(Integer a) {
        someMethod(a);
    }

    public static void main(String[] args) {
        someMethod(Integer.MAX_VALUE);
    }
}
