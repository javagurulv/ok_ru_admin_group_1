package student_sergey_egorichev.lesson_7.level_5.task_24;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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

}
