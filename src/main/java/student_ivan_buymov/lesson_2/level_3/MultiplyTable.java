package student_ivan_buymov.lesson_2.level_3;

import java.util.Scanner;

class MultiplyTable {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.print("Enter number: ");
        var number  = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            // how to define var multiplyOut outside for?
            var multiplyOut = String.format("%d x %d = %d", number, i, number * i);
            System.out.println(multiplyOut);
        }
    }
}
