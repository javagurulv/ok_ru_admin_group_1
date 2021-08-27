package student_yuri_grigorov.lesson_4.level_3_junior.task_8;

import java.util.Scanner;

class EqOrDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers");
        System.out.print("Number 1: ");
        int val1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int val2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int val3 = scanner.nextInt();

        if ((val1 == val2) && (val2 == val3)) {
            System.out.println("All numbers are equal");
        } else if ((val1 != val2) && (val2 != val3) && (val3 != val1)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
