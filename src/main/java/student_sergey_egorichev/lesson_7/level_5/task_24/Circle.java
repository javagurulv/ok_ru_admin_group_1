package student_sergey_egorichev.lesson_7.level_5.task_24;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super();
        this.radius = radius;
    }

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

    public double getRadius() {
        return radius;
    }
}
