package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

public class RectangleTest {

    public static void main(String[] args) {
        var r = new Rectangle("Прямоугольник", 3.0, 4.0);
        System.out.println("Rectangle area: " + r.calculateArea());
        System.out.println("Rectangle perimeter: " + r.calculatePerimeter());
    }

}

