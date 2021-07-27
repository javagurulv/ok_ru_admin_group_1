package student_vladislav_nikitin.lesson_5.level_5.task_31_32_33;

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
}
