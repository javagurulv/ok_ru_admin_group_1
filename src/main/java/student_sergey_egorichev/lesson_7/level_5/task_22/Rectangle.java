package student_sergey_egorichev.lesson_7.level_5.task_22;

class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return this.sideA * this.sideB;
    }

    @Override
    double calculatePerimeter() {
        return this.sideA * 2 + this.sideB * 2;
    }

}
