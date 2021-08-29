package student_yuri_grigorov.lesson_5.level_5_6.task_31_40;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
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
