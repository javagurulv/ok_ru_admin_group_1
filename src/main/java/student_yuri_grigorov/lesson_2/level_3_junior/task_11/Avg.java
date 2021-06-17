package student_yuri_grigorov.lesson_2.level_3_junior.task_11;

import java.util.Scanner;

/**
 * The class Avg asks user to enter tree numbers and performs calculation of average.
 *
 * @author Yuri Grigorov
 */

public class Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int i = 1;
        while (i <= 3) {
            System.out.print("Number " + i + ": ");
            double j = scanner.nextDouble();
            sum = sum + j;
            i++;
        }
        System.out.println("Average is: " + (sum / i));
    }
}
