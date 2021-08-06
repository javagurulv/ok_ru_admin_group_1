package student_maxim_narodovich.lesson_4.level_3.task_10;

import java.util.Scanner;

public class NumbersComparison {
    public static void main(String[] args) {
        System.out.println("Input first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number:");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            System.out.println(firstNumber);
        }
        else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            System.out.println(secondNumber);
        }
        else {
            System.out.println(thirdNumber);
        }
    }
}
