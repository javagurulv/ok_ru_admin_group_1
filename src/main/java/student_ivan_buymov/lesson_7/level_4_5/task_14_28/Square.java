package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

public class Square extends Shape {

    public Double side;

    Square(String title, Double side) {
        super(title);
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
