package student_vladislav_nikitin.lesson_7.level_5.task_20_21_22_23_24_25_26_27_28;

class Triangle extends Shape {

    private double length;

    Triangle(double length) {
        super("Triangle");
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.length, 2) * (Math.sqrt(3) / 4);
    }

    @Override
    public double calculatePerimeter() {
        return this.length * 3;
    }

}
