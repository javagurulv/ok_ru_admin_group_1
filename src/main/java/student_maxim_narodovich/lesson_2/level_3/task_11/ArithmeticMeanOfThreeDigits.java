package student_maxim_narodovich.lesson_2.level_3.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArithmeticMeanOfThreeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        Double arithmeticMean = (double) (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Arithmetic Mean Of Three Digits = " + arithmeticMean);
    }
}
