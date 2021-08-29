package student_yuri_grigorov.lesson_5.level_2.task_10;

/**
 * - создайте массив целых чисел длиной 3,
 * - заполните каждую ячейку массива любым целым числом,
 * - выведите значение каждой ячейки на консоль.
 */

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("ints[%d] = %d%n", i, ints[i]);
        }
    }
}
