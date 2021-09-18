package student_andrey_iv.lesson_2.level_3.task_10;
import java.util.Scanner;

public class CircleInfo {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        System.out.print("Please input circle radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);
        String area_result = String.format("%.4f",area);
        String perimeter_result = String.format("%.4f",perimeter);
        System.out.println("Circle perimeter then is: " + ANSI_RED + perimeter_result + ANSI_RESET);
        System.out.println(" and area of a circle is: " + ANSI_RED + area_result + ANSI_RESET);
    }
}
