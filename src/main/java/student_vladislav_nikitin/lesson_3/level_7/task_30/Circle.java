package student_vladislav_nikitin.lesson_3.level_7.task_30;

class Circle {
    private double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double getRadius() {
        return this.radius;
    }
}
