package student_vladislav_nikitin.lesson_3.level_7.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(8.65);

        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
