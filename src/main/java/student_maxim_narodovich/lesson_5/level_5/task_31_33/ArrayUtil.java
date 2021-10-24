package student_maxim_narodovich.lesson_5.level_5.task_31_33;

import java.util.Random;

public class ArrayUtil {
    int arrayLength;
    int[] array;
    public int[] createArray(int arrayLength) {
        this.arrayLength = arrayLength;
        int[] numbers = new int[this.arrayLength];
        return numbers;
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        this.array = array;
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(100);
        }
    }
}
