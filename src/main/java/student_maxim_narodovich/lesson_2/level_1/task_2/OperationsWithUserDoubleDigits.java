package student_maxim_narodovich.lesson_2.level_1.task_2;

import java.util.Scanner;

public class OperationsWithUserDoubleDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("first number + second number = " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("first number - second number = " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("first number * second number = " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("first number / second number = " + (firstDoubleNumber / secondDoubleNumber));
    }
}
