package student_vladislav_nikitin.lesson_7.level_5.task_20_21_22_23_24_25_26_27_28;

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

}
