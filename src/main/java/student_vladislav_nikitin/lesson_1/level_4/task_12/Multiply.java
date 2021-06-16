package student_vladislav_nikitin.lesson_1.level_4.task_12;

public class Multiply {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Needs 2 number as arguments.");
            System.exit(1);
        }

        int number1 = 0, number2 = 0;
        try {
            number1 = Integer.parseInt(args[0]);
            number2 = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException exception) {
            System.err.println("Invalid argument. Numbers are required.");
            System.err.println(exception.getMessage());
            System.exit(1);
        }

        long multiply = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiply);
    }
}
