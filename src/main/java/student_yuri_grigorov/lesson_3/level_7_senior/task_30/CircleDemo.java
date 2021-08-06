package student_yuri_grigorov.lesson_3.level_7_senior.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {

    static void printArea(Circle circle) {
        System.out.println("Area of the circle with radius " + circle.radius +
                " is " + circle.calculateArea());
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(30);
        printArea(circle1);

        Circle circle2 = new Circle(16.5);
        printArea(circle2);
    }
}
