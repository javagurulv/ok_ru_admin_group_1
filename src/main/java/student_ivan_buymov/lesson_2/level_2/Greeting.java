package student_ivan_buymov.lesson_2.level_2;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        var name = scanner.nextLine();
        var greeting = String.format("Hi, %s!", name);
        System.out.println(greeting);

    }

}
