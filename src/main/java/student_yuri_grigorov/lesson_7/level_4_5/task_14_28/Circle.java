package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
