package student_vladislav_nikitin.lesson_5.level_4.task_29;

import java.util.Random;

class ArrayPracticeAdvanced4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
