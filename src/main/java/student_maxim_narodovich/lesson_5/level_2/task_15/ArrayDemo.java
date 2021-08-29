package student_maxim_narodovich.lesson_5.level_2.task_15;

import java.util.Random;

class ArrayDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
            numbers[i] = numbers[i] + 2;
            System.out.println("numbers[" + i + "] + 2 = " + numbers[i]);
        }
    }
}
