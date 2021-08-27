package student_yuri_grigorov.lesson_4.level_2_intern.task_6;

import java.util.Scanner;

class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        System.out.print("Min: " + ((a < b) ? a : b));
    }
}
