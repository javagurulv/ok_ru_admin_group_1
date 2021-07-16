package student_sergey_kuzmin.lesson_2.level_3_junior.task_10;

import java.util.Scanner;

import static java.lang.Math.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PerimeterAndArea {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter radius of a circle");
        double radius = input.nextDouble();

        double perimeter = 2 * PI * radius;
        double area = PI * pow(radius,2);

        String newLine = System.getProperty("line.separator");
        System.out.println(
                "Perimeter = " + perimeter + newLine
                + "Area = " + area
        );
    }
}
