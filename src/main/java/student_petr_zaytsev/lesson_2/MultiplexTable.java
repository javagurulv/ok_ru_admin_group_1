package student_petr_zaytsev.lesson_2;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MultiplexTable {
    public static void main(String[] args) {
        // we need an array
        int[] range = IntStream.range(1, 11).toArray();

        // we need an input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = scanner.nextDouble();
        int i;
        for (i = 0; i < range.length; i++) {

            // accessing each element of array
            int x = range[i];
            String message = num + " X " + x + " = ";
            double result = num * x;
            System.out.print(message + result + "\n");
        }

    }
}
