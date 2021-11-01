package student_sergey_kuzmin.lesson_4;

import java.util.Scanner;

public class IntegerIncreasing {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter first integer");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter second integer");
        int number2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Please third second integer");
        int number3 = input3.nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println( "Number are in increasing order" );
        } else if (number1 > number2 && number2 > number3) {
            System.out.println( "Number are in decreasing order" );
        } else {
            System.out.println( "Numbers neither are in increasing or decreasing order" );
        }
    }
}
