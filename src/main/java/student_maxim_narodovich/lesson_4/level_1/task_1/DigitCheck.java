package student_maxim_narodovich.lesson_4.level_1.task_1;

import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        System.out.println("Input digit:");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        if (digit > 0) {
            System.out.println("Digit is positive");
        }
        else if (digit < 0) {
            System.out.println("Digit is negative");
        }
        else {
            System.out.println("Something wrong");
        }
    }
}
