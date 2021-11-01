package student_vladislav_nikitin.lesson_7.level_4.task_14_15_16_17_18_19;

class Triangle extends Shape {

    private double length;

    Triangle(double length) {
        super("Triangle");
        this.length = length;
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
