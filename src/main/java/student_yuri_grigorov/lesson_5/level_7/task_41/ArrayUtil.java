package student_yuri_grigorov.lesson_5.level_7.task_41;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    public int getArrayLengthFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        return scanner.nextInt();
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int [] createRandomLengthArray() {
        Random random = new Random();
        return new int [random.nextInt(15)];
    }

    public void fillArrayInteractive(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill the array manually:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("- enter array[%d] value: ", i);
            array[i] = scanner.nextInt();
        }
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            out.append(array[i]);
            if (i < array.length - 1) {
                out.append(", ");
            }
        }
        out.append("]");
        System.out.println(out);
    }

    public void printArrayToConsoleEven(int[] array) {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                out.append(array[i]);
                if (i < array.length - 1) {
                    out.append(", ");
                }
            }
        }
        out.append("]");
        System.out.println(out);
    }

    public void printArrayToConsoleOdd(int[] array) {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                out.append(array[i]);
                if (i < array.length - 1) {
                    out.append(", ");
                }
            }
        }
        out.append("]");
        System.out.println(out);
    }

    public int findMaxNumber(int[] array) {
        int maxVal = array[0];
        for (int i : array) {
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }

    public int findMinNumber(int[] array) {
        int minVal = array[0];
        for (int i : array) {
            if (i < minVal) {
                minVal = i;
            }
        }
        return minVal;
    }
}

