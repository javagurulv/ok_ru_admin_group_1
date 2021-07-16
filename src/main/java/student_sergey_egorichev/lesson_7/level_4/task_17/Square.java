package student_sergey_egorichev.lesson_7.level_4.task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private int side;

    Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

    @Override
    double calculatePerimeter() {
        return this.side * 4;
    }

}