package student_vladislav_nikitin.lesson_7.level_5.task_20_21_22_23_24_25_26_27_28;

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
