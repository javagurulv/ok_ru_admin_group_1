package student_yuri_grigorov.lesson_4.level_2_intern.task_5;

import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        System.out.print("Max: ");
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
