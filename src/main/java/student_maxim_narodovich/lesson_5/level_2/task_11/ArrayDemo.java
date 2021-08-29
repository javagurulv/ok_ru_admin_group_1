package student_maxim_narodovich.lesson_5.level_2.task_11;

import java.util.Scanner;
class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter item number " + i + ":");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
