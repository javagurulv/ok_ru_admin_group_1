package student_yuri_grigorov.lesson_3.level_7_senior.task_30;

class Circle {

    double radius;

    Circle(double cRadius) {
        this.radius = cRadius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
