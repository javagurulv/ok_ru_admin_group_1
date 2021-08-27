package student_yuri_grigorov.lesson_4.level_1_intern.task_2;

import java.util.Scanner;

class PosZeroNeg {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
