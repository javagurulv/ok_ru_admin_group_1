package student_ivan_buymov.lesson_2.level_3;


import java.util.Scanner;

class AverageCalculate {

    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.println("Enter three int numbers:");
        var sum = 0F;
        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            sum += s.nextDouble();
            s.nextLine();
        }
        String resultOut = String.format("Averege is: %f", sum / 3);
        System.out.println(resultOut);
    }

}
