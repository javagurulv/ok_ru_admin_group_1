package student_vladislav_nikitin.lesson_7.level_5.task_20_21_22_23_24_25_26_27_28;

import java.util.Random;

class ShapeUtil {

    private Random randomGenerator = new Random();

    public Circle createRandomCircle() {
        return new Circle(randomGenerator.nextInt(100) + randomGenerator.nextDouble());
    }

    public Square createRandomSquare() {
        return new Square(randomGenerator.nextInt(100) + randomGenerator.nextDouble());
    }

    public Rectangle createRandomRectangle() {
        return new Rectangle(
                randomGenerator.nextInt(100) + randomGenerator.nextDouble(),
                randomGenerator.nextInt(100) + randomGenerator.nextDouble()
        );
    }

    public Triangle createRandomTriangle() {
        return new Triangle(randomGenerator.nextInt(100) + randomGenerator.nextDouble());
    }

    public Shape createRandomShape() {
        int randomNumber = randomGenerator.nextInt(4);
        switch (randomNumber) {
            case 0: return createRandomCircle();
            case 1: return createRandomSquare();
            case 2: return createRandomRectangle();
            default: return createRandomTriangle();
        }
    }

    public double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape: shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape: shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
