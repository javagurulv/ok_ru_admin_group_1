package student_yuri_grigorov.lesson_4.level_2_intern.task_7;

import java.util.Scanner;

class EqualsNotEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}