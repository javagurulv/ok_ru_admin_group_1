package student_yuri_grigorov.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = create2DArray(5, 10);
        fill2DArrayWithRandomNumbers(arr);
        System.out.println("Sum of Array values: " + sum2DArrayItems(arr));
    }

    public static int[][] create2DArray(int arrayLength, int subArrayLength) {
        return new int[arrayLength][subArrayLength];
    }

    public static void fill2DArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int[] subArray : array) {
            for (int i = 0; i < subArray.length; i++) {
                subArray[i] = random.nextInt(10);
            }
        }
    }

    public static int sum2DArrayItems(int[][] array) {
        int sum = 0;
        for (int[] subArray : array) {
            for (int i : subArray) {
                sum += i;
            }
        }
        return sum;
    }
}
