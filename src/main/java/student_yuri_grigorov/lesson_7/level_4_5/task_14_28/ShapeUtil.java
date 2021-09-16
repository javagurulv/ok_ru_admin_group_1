package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        return new Circle("circle", random.nextInt(20));
    }

    Square createRandomSquare() {
        return new Square("square", random.nextInt(20));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("rectangle", random.nextInt(20), random.nextInt(20));
    }

    Triangle createRandomTriangle() {
        double side = random.nextInt(100);
        return new Triangle("triangle", side, side, side);
    }

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

    double calculateArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculatePerimeter();
        }
        return sum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
