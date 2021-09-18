package student_andrey_iv.lesson_2.level_3.task_9;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Please input any integer number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = "  + i*number);
        }
    }
}

