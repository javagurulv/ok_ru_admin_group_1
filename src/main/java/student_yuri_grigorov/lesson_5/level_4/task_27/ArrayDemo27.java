package student_yuri_grigorov.lesson_5.level_4.task_27;

import java.util.Random;

/**
 * - создайте массив произвольной длины
 * - заполните массив случайными числами
 * - распечатайте на консоль все элементы массива
 * - найдите наибольшее число в массиве и выведети его на консоль.
 */

class ArrayDemo27 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength =  random.nextInt(10);
        int[] ints = createArray(arrayLength);
        fillArrayRandom(ints);
        printArrayToConsole(ints);
        System.out.println("Max: " + max(ints));
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

    private static int max(int[] array) {
        int maxVal = array[0];
        for (int i : array) {
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }
}
