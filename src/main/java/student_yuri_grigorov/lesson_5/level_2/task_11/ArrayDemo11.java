package student_yuri_grigorov.lesson_5.level_2.task_11;

import java.util.Scanner;

/**
 * - создайте массив целых чисел длиной 3,
 * - заполните каждую ячейку массива числом, запрошенным у пользователя,
 * - выведите значение каждой ячейки на консоль.
 */

public class ArrayDemo11 {

    public static void main(String[] args) {
        int[] ints = new int[3];

        System.out.printf("Fill the ints[%d] array manually:%n", ints.length);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("  - enter ints[%d] value: ", i);
            ints[i] = scanner.nextInt();
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.printf("ints[%d] = %d%n", i, ints[i]);
        }
    }
}
