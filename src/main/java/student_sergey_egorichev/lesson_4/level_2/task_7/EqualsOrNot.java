package student_sergey_egorichev.lesson_4.level_2.task_7;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class EqualsOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (integer): ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number (integer): ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
