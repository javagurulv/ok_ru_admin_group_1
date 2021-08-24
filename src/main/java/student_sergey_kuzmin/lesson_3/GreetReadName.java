package student_sergey_kuzmin.lesson_3;

import java.util.Scanner;

public class GreetReadName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = input.next();

        String greeting = "Hi, " + userName + "!";
        System.out.println(greeting);
    }
}
