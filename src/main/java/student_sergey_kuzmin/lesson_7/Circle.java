package student_sergey_kuzmin.lesson_7;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
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

