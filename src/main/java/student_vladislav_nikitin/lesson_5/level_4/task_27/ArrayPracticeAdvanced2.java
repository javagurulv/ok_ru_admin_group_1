package student_vladislav_nikitin.lesson_5.level_4.task_27;

import java.util.Random;

class ArrayPracticeAdvanced2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximum value of element in array = " + max);
    }
}
