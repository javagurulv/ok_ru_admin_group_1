package student_sergey_kuzmin.lesson_4;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter whole number:");
        int number = input.nextInt();
        int remainder = number % 2;

        if (remainder == 0) {
            System.out.println("This number is even.");
        } else if (remainder == 1) {
            System.out.println("This number is odd.");
        } else {
            System.out.println("Sad news: World is gonna end soon!");
        }
    }
}


