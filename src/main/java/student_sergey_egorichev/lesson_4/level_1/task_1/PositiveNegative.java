package student_sergey_egorichev.lesson_4.level_1.task_1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some number (integer): ");
        int someNumber = scanner.nextInt();

        if (someNumber < 0) {
            System.out.println(someNumber + " is negative.");
        } else {
            System.out.println(someNumber + " is positive.");
        }
    }
}
