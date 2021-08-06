package student_maxim_narodovich.lesson_4.level_1.task_4;

import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        System.out.println("Input digit:");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        boolean ifModuloIsZero = digit % 2 == 0;
        if (ifModuloIsZero) {
            System.out.println("Digit is even");
        }
        else {
            System.out.println("Digit is not even");
        }

    }
}
