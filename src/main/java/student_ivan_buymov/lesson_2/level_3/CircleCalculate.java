package student_ivan_buymov.lesson_2.level_3;

import java.util.Scanner;

class CircleCalculate {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = s.nextDouble();
        var perimeterOut = String.format("Perimeter is: %f", 2 * Math.PI * radius);
        var areaOut = String.format("Area is: %f", Math.PI * Math.pow(radius, 2));
        System.out.println(perimeterOut);
        System.out.println(areaOut);

    }

}