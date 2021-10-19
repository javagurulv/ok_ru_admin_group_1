package student_sergey_egorichev.lesson_11.level_3.task_18;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        Integer i = null;
        try {
            // Здесь всплывает исключение, т.к мы обращаемся к объекту который хранис ссылку на null
            System.out.println(i + 1);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
