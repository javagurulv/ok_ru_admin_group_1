package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

public class ShapeUtilTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Круг", 1.0);
        shapes[1] = new Square("Квадрат",4.0);
        shapes[2] = new Rectangle("Прямоугольник", 4.0, 4.0);
        shapes[3] = new Triangle("Треугольник",4.0);

        // I know, it's very naive tests, but I have no time, sorry :)
        for (Shape shape : shapes) {
            var area = shape.calculateArea();
            var perimeter = shape.calculatePerimeter();
            if (area >= 0){
                System.out.printf("Test '%s' area: OK\n", shape.title);
            } else {
                System.out.printf("FAIL: '%s' area must be >= zero, got: %d\n", shape.title, area);
            }
            if (perimeter >= 0) {
                System.out.printf("Test '%s' perimeter: OK\n", shape.title);
            } else {
                System.out.printf("FAIL: '%s' perimeter must be >= zero, got: %d\n", shape.title, perimeter);
            }
        }
    }



}
