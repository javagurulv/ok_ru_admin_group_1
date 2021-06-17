package student_vladislav_nikitin.lesson_2.level_3.task_10;

import java.util.Scanner;

public class Circle {
    double radius;
    double perimeter;
    double area;
    static final double PI = 3.14159265359;

    public Circle(double r) {
        this.radius = r;
        this.perimeter = 2 * PI * r;
        this.area = PI * Math.pow(radius, 2);
    }

    static double getRadiusFromInput(String message) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(message);
            if (!scanner.hasNextDouble()) {
                System.err.println(scanner.next() + " is not real number");
            } else {
                return scanner.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(getRadiusFromInput("Radius of circle: "));
        System.out.println("Perimeter is: " + circle.perimeter);
        System.out.println("Area is: " + circle.area);
    }
}
