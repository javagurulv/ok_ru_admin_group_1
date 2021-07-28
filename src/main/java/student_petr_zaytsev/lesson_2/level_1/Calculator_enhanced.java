package student_petr_zaytsev.lesson_2.level_1;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Calculator_enhanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // slightly extended homework. Now it can do even more. nextDouble could be just the same
        System.out.println("Enter number: ");
        float numberOne = scanner.nextFloat();
        System.out.println("Enter another number: ");
        float numberTwo = scanner.nextFloat();

        float result_sum = numberOne + numberTwo;
        float result_sub = numberOne - numberTwo;
        float result_multiply = numberOne * numberTwo;
        float result_div = numberOne / numberTwo;

        System.out.println("sum: " + result_sum);
        System.out.println("difference: " + result_sub);
        System.out.println("product: " + result_multiply);
        System.out.println("quotient: " + result_div);
    }
}
