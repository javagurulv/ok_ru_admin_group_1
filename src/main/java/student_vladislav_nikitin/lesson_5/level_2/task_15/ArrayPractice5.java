package student_vladislav_nikitin.lesson_5.level_2.task_15;

import java.util.Random;

class ArrayPractice5 {

    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
            arr[i] += 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

}
