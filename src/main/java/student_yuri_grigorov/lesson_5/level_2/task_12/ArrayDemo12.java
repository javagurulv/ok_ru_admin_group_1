package student_yuri_grigorov.lesson_5.level_2.task_12;

import java.util.Random;

/**
 * - создайте массив целых чисел длиной 3,
 * - заполните каждую ячейку массива случайным числом,
 * - выведите значение каждой ячейки на консоль.
 */

class ArrayDemo12 {
    public static void main(String[] args) {
        int[] ints = new int[3];

        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.printf("ints[%d] = %d%n", i, ints[i]);
        }
    }
}
