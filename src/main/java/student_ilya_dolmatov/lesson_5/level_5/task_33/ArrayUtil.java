package student_ilya_dolmatov.lesson_5.level_5.task_33;

import java.util.Random;

class ArrayUtil {
    Random random = new Random();

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void checkArray(int[] array){
        System.out.println("Array length is: " + array.length);
        for(int i=0; i< array.length ; i++){
            System.out.println("Value of array index " + i + " is: " + array[i]);
        }
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
