package student_sergey_egorichev.lesson_4.level_3.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(3) {
        };

        for (int i = 0; i < 3; i ++) {
            numbers.add(scanner.nextInt());
        }

        boolean firstGreaterSecond;
        boolean secondGreaterThird;

        if (numbers.get(0) > numbers.get(1)) {
            firstGreaterSecond = true;
        } else {
            firstGreaterSecond = false;
        }

        if (numbers.get(1) > numbers.get(2)) {
            secondGreaterThird = true;
        } else {
            secondGreaterThird = false;
        }

        if (firstGreaterSecond && secondGreaterThird) {
            System.out.println("decreasing");
        } else if (!firstGreaterSecond && !secondGreaterThird) {
            System.out.println("increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
