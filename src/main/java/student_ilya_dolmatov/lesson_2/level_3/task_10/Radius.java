package student_ilya_dolmatov.lesson_2.level_3.task_10;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга(вещественно число):");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;

        System.out.println("Test Data:\nRadius = " + radius + "\n\nExpected Output");
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
