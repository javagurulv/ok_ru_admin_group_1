package student_yuri_grigorov.lesson_5.level_2.task_14;

import java.util.Arrays;
import java.util.Random;

/**
 *  - создайте массив целых чисел длиной 3,
 *  - заполните каждую ячейку массива случайным числом,
 *  - посчитайте среднее значение и выведите его на консоль.
 */

public class ArrayDemo14 {
    public static void main(String[] args) {
        int[] ints = new int[3];

        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }

        System.out.println(avg(ints));
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private static double avg(int[] array) {
        int sum = sum(array);
        return (double) sum / array.length;
    }
}
