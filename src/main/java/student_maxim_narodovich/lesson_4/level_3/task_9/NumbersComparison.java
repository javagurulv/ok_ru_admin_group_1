package student_maxim_narodovich.lesson_4.level_3.task_9;

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

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("decreasing");
        }
        else if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("increasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
