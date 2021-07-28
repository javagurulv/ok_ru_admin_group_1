package student_maxim_narodovich.lesson_4.level_2.task_7;

import java.util.Scanner;

public class NumbersComparison {
    public static void main(String[] args) {
        System.out.println("Input first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
