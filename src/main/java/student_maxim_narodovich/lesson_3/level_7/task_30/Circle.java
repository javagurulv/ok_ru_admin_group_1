package student_maxim_narodovich.lesson_3.level_7.task_30;
import java.lang.Math.*;
public class Circle {
    double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }
    public double calculateArea() {
        return Math.PI * this.circleRadius * this.circleRadius;
    }
}
