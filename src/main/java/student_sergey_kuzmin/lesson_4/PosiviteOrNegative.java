package student_sergey_kuzmin.lesson_4;

import java.util.Scanner;

public class PosiviteOrNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer:");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("This number is negative");
        } else if (number == 0){
            System.out.println("This number equals zero");
        } else {
            System.out.println("This number is positive");
        }
    }
}
