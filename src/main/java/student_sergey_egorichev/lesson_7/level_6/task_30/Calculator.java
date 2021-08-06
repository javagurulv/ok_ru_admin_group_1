package student_sergey_egorichev.lesson_7.level_6.task_30;

public class Calculator {

    public static int sumNumbers(int ... numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum = sum + number;
        }
        return sum;
    }
}
