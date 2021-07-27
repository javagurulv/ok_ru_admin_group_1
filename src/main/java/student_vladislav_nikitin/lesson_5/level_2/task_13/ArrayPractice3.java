package student_vladislav_nikitin.lesson_5.level_2.task_13;

import java.util.Random;

class ArrayPractice3 {

    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }

}
