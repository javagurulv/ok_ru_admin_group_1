package student_yuri_grigorov.lesson_5.level_2.task_15;

import java.util.Random;

/**
 * - создайте массив целых чисел длиной 3,
 * - заполните каждую ячейку массива случайным числом,
 * - выведите значение каждой ячейки на консоль,
 * - увеличьте значение каждой ячейки на 2,
 * - выведите значение каждой ячейки на консоль.
 */

class ArrayDemo15 {
    public static void main(String[] args) {
        int[] ints = new int[3];

        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }

        printIntArrayToConsole(ints);

        for (int i = 0; i < ints.length; i++) {
            ints[i] += 2;
        }

        printIntArrayToConsole(ints);
    }

    private static void printIntArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] = %d%n", i, array[i]);
        }
    }
}
