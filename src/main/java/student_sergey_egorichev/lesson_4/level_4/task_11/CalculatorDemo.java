package student_sergey_egorichev.lesson_4.level_4.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Sum: " + calc.sum(firstNumber, secondNumber));
        System.out.println("Sub: " + calc.sub(firstNumber, secondNumber));
        System.out.println("Div: " + calc.div(firstNumber, secondNumber));
        System.out.println("Mult: " + calc.mult(firstNumber, secondNumber));
    }
}
