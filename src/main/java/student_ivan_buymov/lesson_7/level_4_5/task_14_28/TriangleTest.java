package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

public class TriangleTest {
    public static void main(String[] args) {
        var t = new Triangle("Треугольник", 3.0);
        System.out.println("Triangle area: " + t.calculateArea());
        System.out.println("Triangle perimetr: " + t.calculatePerimeter());
    }
}
