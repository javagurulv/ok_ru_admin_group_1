package student_petr_zaytsev.lesson_2.level_3;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * Math.pow(radius, 2) / 2;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

    }
}
