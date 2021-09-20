package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

public class Circle extends Shape {

    public Double radius;

    Circle(String title, Double radius) {
        super(title);
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
