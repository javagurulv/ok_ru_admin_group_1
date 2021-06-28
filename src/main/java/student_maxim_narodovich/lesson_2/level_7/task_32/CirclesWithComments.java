package student_maxim_narodovich.lesson_2.level_7.task_32;

//Import libraries
import java.util.Scanner;
import java.lang.Math;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CirclesWithComments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius please: ");
        double circleRadius = scanner.nextDouble();

        /*
        Used Math Library
        for Pi
         */
        System.out.println("Perimeter is = " + (2 * circleRadius * Math.PI));
        System.out.println("Area is = " + (circleRadius * circleRadius * Math.PI));

    }
}
