package student_vladislav_nikitin.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {
    private Random random = new Random();

    public int[][] create(int rows, int columns) {
        if (rows == 0 || columns == 0) {
            return null;
        }
        return new int[rows][columns];
    }

    public void fillWithRandomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            fillRowWithRandomNumbers(array[i]);
        }
    }

    public int calculateSumOfElements(int[][] array) {
        int sum = 0;
        for (int[] n: array) {
            sum += calculateSumOfElementsInRow(n);
        }
        return sum;
    }

    public void printArrayToTerminal(int[][] array) {
        for (int[] row: array) {
            for (int n: row) {
                System.out.printf("[%d]\t", n);
            }
            System.out.println();
        }
    }

    private void fillRowWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private int calculateSumOfElementsInRow(int[] array) {
        int sum = 0;
        for (int n: array) {
            sum += n;
        }
        return sum;
    }
}
