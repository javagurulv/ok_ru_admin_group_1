package student_petr_zaytsev.lesson_4.level_3;

import java.util.Scanner;

public class CompareThreeIntegersAnalyze {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter third number: ");
        int z = scanner.nextInt();

        if ((x == y) && (y == z)) {
            System.out.println("All numbers are different");
            System.exit(0);
        }

        if ((x != y) && (y != z) && (z != x)) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
