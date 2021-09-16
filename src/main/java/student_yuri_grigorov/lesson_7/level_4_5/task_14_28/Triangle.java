package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class Triangle extends Shape{

    double sideA;
    double sideB;
    double sideC;

    Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double p = calculatePerimeter();
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    double calculatePerimeter() {
        return (sideA + sideB + sideC) / 2;
    }
}
