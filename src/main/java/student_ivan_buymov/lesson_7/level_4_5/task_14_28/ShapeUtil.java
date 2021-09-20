package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

import java.util.Random;

public class ShapeUtil {

    Random rand = new Random();

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    Circle createRandomCircle() {
        return new Circle("Круг", rand.nextDouble() * 10);
    }
    Square createRandomSquare() {
        return new Square("Квадрат", rand.nextDouble() * 10);
    }
    Rectangle createRandomRectangle() {
        return new Rectangle("Прямоугольник", rand.nextDouble() * 10, rand.nextDouble() * 10);
    }
    Triangle createRandomTriangle() {
        return new Triangle("Треугольник", rand.nextDouble() * 10);
    }

    double calculateArea(Shape[] shapes){
        Double areaSum = 0.0;
        for (Shape shape: shapes ) {
            areaSum += shape.calculateArea();
        }
        return areaSum;
    };

    double calculatePerimeter(Shape[] shapes) {
        Double perimeterSum = 0.0;
        for (Shape shape: shapes ) {
            perimeterSum += shape.calculatePerimeter();
        }
        return perimeterSum;
    }


}
