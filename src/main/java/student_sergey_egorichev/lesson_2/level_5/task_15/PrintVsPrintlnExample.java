package student_sergey_egorichev.lesson_2.level_5.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PrintVsPrintlnExample {
    public static void main(String[] args) {
        String suffix = "";
        for (int i = 99; i >= 0; i--) {
            if (i > 1) {
                System.out.print(i);
                System.out.print(" bottles of beer on the wall, ");
                System.out.print(i);
                System.out.println(" bottles of beer.");
                if (i > 2) {
                    suffix = i - 1 + " bottles of beer on the wall.";
                } else {
                    suffix = "1 bottle of beer on the wall.";
                }
            } else if (i == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                suffix = "no more beer on the wall!";
            }

            System.out.println("Take one down, pass it around, " + suffix);

        }
    }
}
