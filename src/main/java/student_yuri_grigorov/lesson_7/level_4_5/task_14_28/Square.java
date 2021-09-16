package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    double calculatePerimeter() {
        return this.side * 4;
    }
}
