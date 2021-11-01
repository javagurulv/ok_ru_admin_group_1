package student_sergey_kuzmin.lesson_4;

import java.util.Scanner;

public class IntegerLower {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter first integer");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter second integer");
        int number2 = input2.nextInt();

        if (number2 > number1) {
            System.out.println( number1 );
        } else if (number2 < number1) {
            System.out.println( number2 );
        } else {
            System.out.println( "Numbers are equal" );
        }
    }
}
