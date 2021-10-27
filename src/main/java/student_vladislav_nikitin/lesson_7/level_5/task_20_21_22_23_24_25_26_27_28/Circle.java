package student_vladislav_nikitin.lesson_7.level_5.task_20_21_22_23_24_25_26_27_28;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
