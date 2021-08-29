package student_yuri_grigorov.lesson_5.level_4.task_29;

import java.util.Random;

/**
 * - создайте массив произвольной длины
 * - заполните массив случайными числами
 * - распечатайте на консоль все элементы массива
 * - найдите все чётные числа в массиве и выведети их на консоль.
 */

class ArrayDemo29 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(10);
        int[] ints = createArray(arrayLength);
        fillArrayRandom(ints);
        printArrayToConsole(ints);
        printEvenArrayItemsToConsole(ints);
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
        System.out.println("array");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("  [%d] = %d%n", i, array[i]);
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenArrayItemsToConsole(int[] array) {
        System.out.println("array (even items only)");
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                System.out.printf("  [%d] = %d%n", i, array[i]);
            }
        }
    }
}