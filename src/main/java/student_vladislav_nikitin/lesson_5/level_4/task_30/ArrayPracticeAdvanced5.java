package student_vladislav_nikitin.lesson_5.level_4.task_30;

import java.util.Random;

class ArrayPracticeAdvanced5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isOdd(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static boolean isOdd(int number) {
        return (number % 2) != 0;
    }
}
