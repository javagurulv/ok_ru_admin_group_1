package student_sergey_egorichev.lesson_7.level_5.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Triangle extends Shape {

    private int side;

    Triangle(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (this.side * this.side * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimeter() {
        return this.side * 3;
    }

}
