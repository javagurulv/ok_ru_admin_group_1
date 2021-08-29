package student_maxim_narodovich.lesson_5.level_2.task_13;

import java.util.Random;

class ArraySum {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
//            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        System.out.println("sum = " + sum);
    }
}
