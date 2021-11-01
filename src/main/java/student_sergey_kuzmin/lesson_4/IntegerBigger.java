package student_sergey_kuzmin.lesson_4;

import java.util.Scanner;

public class IntegerBigger {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter first integer");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter second integer");
        int number2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter third integer");
        int number3 = input3.nextInt();

        if (number1 >= number2 && number1 >= number3 ) {
            System.out.println( number1 );
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println( number2 );
        } else
            System.out.println( number3 );
    }
}
