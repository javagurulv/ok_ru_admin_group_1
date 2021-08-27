package student_yuri_grigorov.lesson_4.level_1_intern.task_1;

import java.util.Scanner;

class PosOrNeg {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
