package student_sergey_egorichev.lesson_11.level_3.task_20;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            // более "узкий" эксепшен должен идти раньше, иначе ниже первого catch выполнение не опустится.
        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
