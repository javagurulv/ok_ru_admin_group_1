package student_petr_zaytsev.lesson_4.level_3;

import java.util.Scanner;

public class IncreasingDecreasingInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter third number: ");
        int z = scanner.nextInt();

        // this covers all cases. if we get three integers of same kind, one of them will be returned
        if ((z >= y) && (y >= x) && (x != z)) {
            System.out.println("increasing");
        } else if ((x >= y) && (y >= z) && (x != z)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
