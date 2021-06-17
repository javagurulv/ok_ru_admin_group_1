package student_yuri_grigorov.lesson_2.level_3_junior.task_10;

import java.util.Scanner;

/**
 * The class PerimeterArea asks user to enter radius and performs calculation of perimeter and area
 *
 * @author Yuri Grigorov
 */

public class PerimeterArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
