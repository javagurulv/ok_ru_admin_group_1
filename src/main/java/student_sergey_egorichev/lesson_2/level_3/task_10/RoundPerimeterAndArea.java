package student_sergey_egorichev.lesson_2.level_3.task_10;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RoundPerimeterAndArea {
    public static void main(String[] args) {
        System.out.println("""
                Привет, это снова я, электроПетрович.
                Представь себе окружность, а я посчитаю её длину и площадь круга.
                Какой радиус у твоей окружности? (не обязательно целое число):""");

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * square(radius);

        String resultOutput = String.format("""
                Perimeter is = %f
                Area is = %f""",
                perimeter, area);

        System.out.println(resultOutput);

    }

    static double square(double someNumber) {
        return someNumber * someNumber;
    }
}
