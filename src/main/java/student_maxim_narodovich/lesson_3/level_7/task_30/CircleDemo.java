package student_maxim_narodovich.lesson_3.level_7.task_30;
import java.util.Scanner;
public class CircleDemo {
    public static void main(String[] args) {
        System.out.println("Input circle radius:");
        Scanner scanner = new Scanner(System.in);
        int circleRadius = scanner.nextInt();
        Circle myCircle = new Circle(circleRadius);
        System.out.println("Circle square is " + myCircle.calculateArea());
    }
}
