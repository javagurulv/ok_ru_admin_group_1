package student_vladislav_nikitin.lesson_5.level_7.task_41;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public int[] createArray(int arrayLength) {
        if (arrayLength < 0) {
            return null;
        }
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = this.random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array element %d = %d\n", i+1, array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int findMinNumber(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public void printEvenElementsOfArray(int[] array) {
        System.out.print("Even numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public void printOddElementsOfArray(int[] array) {
        System.out.print("Odd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (! isEven(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public int getArrayLengthFromUser() {
        return getUserInt("Input length of array: ");
    }

    public void fillArrayWithUserPrompt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getUserInt("Input integer " + Integer.valueOf(i + 1) + ": ");
        }
    }

    private int getUserInt(String message) {
        while (true) {
            System.out.print(message);
            if (! this.scanner.hasNextInt()) {
                System.out.println(this.scanner.next() + " is not integer!");
                continue;
            }
            return this.scanner.nextInt();
        }
    }

    private boolean isEven(int number) {
        return (number % 2) == 0;
    }

}
