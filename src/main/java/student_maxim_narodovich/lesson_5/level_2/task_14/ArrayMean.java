package student_maxim_narodovich.lesson_5.level_2.task_14;

import java.util.Random;

class ArrayMean {
    public static void main(String[] args) {
        Random random = new Random();
        double sum = 0;
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
//            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        double mean = sum / numbers.length;
        System.out.println("mean = " + mean);
    }
}
