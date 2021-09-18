package student_andrey_iv.lesson_2.level_3.task_11;
import java.util.Scanner;

public class AverageInfo {
    public static void main(String[] args) {
        float[] array = new float[3];
        Scanner input = new Scanner(System.in);
        float result=1f;
        float final_result;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter number: ");
            array[i] = input.nextFloat();
            result = result * array[i];
        }
        
        final_result = result / array.length;
        System.out.println( "Average for this numbers: " + final_result);
    }
}
