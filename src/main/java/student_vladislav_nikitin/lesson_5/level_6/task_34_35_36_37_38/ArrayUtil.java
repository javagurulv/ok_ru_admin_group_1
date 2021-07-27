package student_vladislav_nikitin.lesson_5.level_6.task_34_35_36_37_38;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        if (arrayLength < 0) {
            return null;
        }
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
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
}
