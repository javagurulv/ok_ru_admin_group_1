package student_ilya_dolmatov.lesson_5.level_4.task_28;

import java.util.Random;

class MinOfRandomArray {
    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = random.nextInt(10)+3;
        int[] array = new int[arrayLength];

        int i;
        for(i = 0 ; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        int minValOfArray = array[0];
        for(i = 0 ; i < array.length; i++) {
            System.out.println("Value for array index " + i + " is: " + array[i]);
            if (array[i] < minValOfArray) {
                minValOfArray = array[i];
            }
        }

        System.out.println("\nMin array value: " + minValOfArray);

    }
}
