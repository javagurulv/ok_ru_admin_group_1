package student_sergey_egorichev.lesson_7.level_4.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape {

    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
