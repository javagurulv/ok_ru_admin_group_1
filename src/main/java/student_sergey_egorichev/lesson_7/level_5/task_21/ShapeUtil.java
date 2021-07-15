package student_sergey_egorichev.lesson_7.level_5.task_21;

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

}
