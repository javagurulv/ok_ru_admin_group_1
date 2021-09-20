package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

public class Rectangle extends Shape {

    public double sideOne, sideTwo;

    Rectangle(String title, Double sideOne, Double sideTwo) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        return this.sideOne * this.sideTwo;
    }

    @Override
    double calculatePerimeter() {
        return (this.sideOne + this.sideTwo) * 2;
    }
}
