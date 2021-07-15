package student_sergey_egorichev.lesson_7.level_5.task_27;

import java.util.Random;

public class ShapeUtil {

    private static int getRandom() {
        return (int) (Math.random() * 100);
    }

    public static Circle createRandomCircle() {
        return new Circle(getRandom());
    }

    public static Square createRandomSquare() {
        return new Square(getRandom());
    }

    public static Rectangle createRandomRectangle() {
        return new Rectangle(getRandom(), getRandom());
    };

    public static Triangle createRandomTriangle() {
        return new Triangle(getRandom());
    }

    public static Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        switch (randomNumber) {
            case 0: return createRandomCircle();
            case 1: return createRandomSquare();
            case 2: return createRandomRectangle();
            default: return createRandomTriangle();
        }
    }

    public static double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape: shapes) {
            areaSum = shape.calculateArea() + areaSum;
        }
        return areaSum;
    }

    public static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public static double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape: shapes) {
            perimeterSum = shape.calculatePerimeter() + perimeterSum;
        }
        return perimeterSum;
    }

    public static double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
