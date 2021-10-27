package student_vladislav_nikitin.lesson_7.level_4.task_14_15_16_17_18_19;

class Square extends Shape {

    private double length;

    Square(double length) {
        super("Square");
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public double calculatePerimeter() {
        return this.length * 4;
    }

}
