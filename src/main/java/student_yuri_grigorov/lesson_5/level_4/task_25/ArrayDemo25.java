package student_yuri_grigorov.lesson_5.level_4.task_25;

import java.util.Scanner;

/**
 * - запросите у пользователя с консоли длину массива
 * - создайте массив указанной пользователем длины
 * - заполните массив числами полученными от пользователя
 * - распечатайте на консоль все элементы массива.
 */

class ArrayDemo25 {

    public static void main(String[] args) {
        int arrayLength = getArrayLengthFromConsole();
        int[] ints = createArray(arrayLength);
        fillArrayInteractive(ints);
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

    private static void fillArrayInteractive(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Fill the array manually:%n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("  - enter array[%d] value: ", i);
            array[i] = scanner.nextInt();
        }
    }

    private static void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d%n", i, array[i]);
        }
    }
}
