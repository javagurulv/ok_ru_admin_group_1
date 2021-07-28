package student_sergey_egorichev.lesson_7.level_5.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ShapeUtil {

    private static int getRandom() {
        return (int) (Math.random() * 100);
    }

    public static Circle createRandomCircle(String title) {
        return new Circle(title, getRandom());
    }

    public static Square createRandomSquare(String title) {
        return new Square(title, getRandom());
    }

    public static Rectangle createRandomRectangle(String title) {
        return new Rectangle(title, getRandom(), getRandom());
    };

    public static Triangle createRandomTriangle(String title) {
        return new Triangle(title, getRandom());
    }

}
