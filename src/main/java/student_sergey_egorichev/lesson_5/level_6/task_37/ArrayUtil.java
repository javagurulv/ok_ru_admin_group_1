package student_sergey_egorichev.lesson_5.level_6.task_37;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public int findMaxNumber(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    public int findMinNumber(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

}
