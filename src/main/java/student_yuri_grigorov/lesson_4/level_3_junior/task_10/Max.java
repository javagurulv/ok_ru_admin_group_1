package student_yuri_grigorov.lesson_4.level_3_junior.task_10;

import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers");
        System.out.print("Number 1: ");
        int val1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int val2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int val3 = scanner.nextInt();

        int[] nums = {val1, val2, val3};
        int maxVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }
        System.out.println("Max: " + maxVal);
    }
}
