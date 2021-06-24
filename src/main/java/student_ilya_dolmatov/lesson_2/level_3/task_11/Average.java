package student_ilya_dolmatov.lesson_2.level_3.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Average {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        double firstDigit = scanner.nextDouble();
        System.out.println("Введите второе число:");
        scanner = new Scanner(System.in);
        double secondDigit = scanner.nextDouble();
        System.out.println("Введите третье число:");
        scanner = new Scanner(System.in);
        double thirdDigit = scanner.nextDouble();

        double average = (firstDigit + secondDigit + thirdDigit) / 3;

        System.out.println("Среднее арифметическое чисел " + firstDigit + ", " + secondDigit + ", " + thirdDigit +
                " = " + average);
    }

}
