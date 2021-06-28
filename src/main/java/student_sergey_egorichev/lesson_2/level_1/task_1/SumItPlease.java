package student_sergey_egorichev.lesson_2.level_1.task_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SumItPlease {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Привет, меня зовут электроПетрович, я умею складывать целые числа.
                И сейчас я тебе это докажу.
                Каким будет твоё первое число?"""
        );
        int firstNumber = scanner.nextInt();

        System.out.println("А теперь сосредоточься и придумай ещё одно целое число:");
        int secondNumber = scanner.nextInt();

        System.out.println("Xa, это просто! "
                           + firstNumber + "+" + secondNumber
                           + " будет " + (firstNumber + secondNumber)
        );
    }
}
