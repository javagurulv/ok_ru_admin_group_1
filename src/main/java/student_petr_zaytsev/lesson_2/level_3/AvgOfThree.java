package student_petr_zaytsev.lesson_2.level_3;
import java.util.Scanner;

public class AvgOfThree {
    public static void main(String[] args) {
        // enter three numbers
        Scanner scanner = new Scanner(System.in);

        // store them in an array. I suppose we work with 3 numbers
        double[] nums = new double[3];

        System.out.println("Enter first number: ");
        double first = scanner.nextDouble();
        nums[0] = first;

        System.out.println("Enter second number: ");
        double second = scanner.nextDouble();
        nums[1] = second;

        System.out.println("Enter third number: ");
        double third = scanner.nextDouble();
        nums[2] = third;

        double sum = 0;

        for (double d : nums) {
            sum += d;
        }
        double result = sum / nums.length;

        System.out.println("avg value: " + result);
    }
}
