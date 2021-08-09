package student_petr_zaytsev.lesson_4.level_3;

import java.util.Scanner;

public class CompareThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter third number: ");
        int z = scanner.nextInt();

        int result = Comparator(x, y, z);

        String output = String.valueOf(result);

        System.out.println(output);

    }
    static int Comparator(int x, int y, int z)
    {
        int first_set = x - y; // 5   10
        int second_set = y - z; // -15   5
        int third_set = z - x; // 10   20

        if  (first_set <= 0) { //  y > x
            if (second_set <= 0) { // z > y
                return z;
            } else {
                return y;
            }
        } else { // y < x
            if ( third_set <= 0) { // x > z
                return x;
            } else {
                return z;
            }
        }
    }
}
