package student_ivan_buymov.lesson_5.level_5.task_31_33;

import java.util.Random;

class ArrayUtil {


    public int[] createArray(int arrayLength) throws IllegalArgumentException {
        if (arrayLength >= 0) {
            return new int[arrayLength];
        } else {
            throw new IllegalArgumentException("number can't be a negative, got: " + arrayLength);
        }
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println("[");
        for (int i: array) {
            System.out.println(i);
        }
        System.out.println("]");
    }

}
