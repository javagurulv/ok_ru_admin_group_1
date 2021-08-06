package student_maxim_narodovich.lesson_4.level_2.task_5;

import java.util.Scanner;

public class NumbersComparison {
    public static void main(String[] args) {
        int greatestNumber;
        System.out.println("Input first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            greatestNumber = firstNumber;
        }
        else {
            greatestNumber = secondNumber;
        }
        System.out.println(greatestNumber + " is greatest");
    }
}
