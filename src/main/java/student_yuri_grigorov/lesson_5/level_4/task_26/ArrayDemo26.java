package student_yuri_grigorov.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

/**
 * - запросите у пользователя с консоли длину массива
 * - создайте массив указанной пользователем длины
 * - заполните массив случайными числами
 * - распечатайте на консоль все элементы массива.
 */

class ArrayDemo26 {

    public static void main(String[] args) {
        int arrayLength = getArrayLengthFromConsole();
        int[] ints = createArray(arrayLength);
        fillArrayRandom(ints);
        printArrayToConsole(ints);
    }

    private static int getArrayLengthFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        return scanner.nextInt();
    }

    private static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    private static void fillArrayRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    private static void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d%n", i, array[i]);
        }
    }
}
