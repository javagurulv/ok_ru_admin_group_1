package student_sergey_kuzmin.lesson_2.level_1_intern.task_2;

import java.util.Scanner;

public class CalcDouble {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first double number");
        double firstDouble = input.nextDouble();

        System.out.println("Please enter second double number");
        double secondDouble = input.nextDouble();

        double add = firstDouble + secondDouble;
        double substr = firstDouble - secondDouble;
        double mult = firstDouble * secondDouble;
        double division = firstDouble / secondDouble;

        String newLine = System.getProperty("line.separator");
        System.out.println(
                "Here it comes! Results of:" + newLine
                        + "addition - " + add + newLine
                        + "substraction - " + substr + newLine
                        + "multiplication - " + mult + newLine
                        + "division - " + division + newLine
        );
    }
}
