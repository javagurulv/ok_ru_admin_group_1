package student_sergey_egorichev.lesson_3.level_7.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {

        return Math.PI * this.radius * this.radius;

    }

}
