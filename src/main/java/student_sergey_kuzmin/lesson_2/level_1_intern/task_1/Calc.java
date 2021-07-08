package student_sergey_kuzmin.lesson_2.level_1_intern.task_1;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first whole number");
        int firstWhole = input.nextInt();

        System.out.println("Please enter second whole number");
        int secondWhole = input.nextInt();

        int add = firstWhole + secondWhole;
        int substr = firstWhole - secondWhole;
        int mult = firstWhole * secondWhole;
        int division = firstWhole / secondWhole;

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
