package student_petr_zaytsev.lesson_4.level_1;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double number = scanner.nextDouble();

        System.out.println(number + " is "
                + checkPosNeg(number));
    }

    static String checkPosNeg(double x)
    {
        if (x > 0)
            return "Positive";
        else if (x < 0)
            return "Negative";
        else
            return "zero";
    }

}

