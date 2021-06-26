package student_sergey_egorichev.lesson_4.level_2.task_5;

import java.util.Scanner;

public class WhichIsMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (integer): ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number (integer): ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println("Same");
        }
    }
}
