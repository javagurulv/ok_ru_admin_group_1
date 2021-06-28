package student_sergey_egorichev.lesson_4.level_3.task_8;

import java.util.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Довольно сложное решение. Попробуй вынести операцию нахождения наибольшего числа в отдельный метод и потом несколько раз воспользоваться ей.")
public class CompareThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOf = List.of("first", "second", "third");

        Map<String, Integer> numbers = new HashMap<>(3);

        for (String element : listOf) {
            System.out.print("Enter " + element + " number (integer): ");
            int number = scanner.nextInt();
            numbers.put(element, number);
        }

        boolean firstSecondEqual;
        boolean secondThirdEqual;
        boolean firstThirdEqual;

        if (numbers.get("first") == numbers.get("second")) {
            firstSecondEqual = true;
        } else {
            firstSecondEqual = false;
        }

        if (numbers.get("second") == numbers.get("third")) {
            secondThirdEqual = true;
        } else {
            secondThirdEqual = false;
        }

        if (numbers.get("first") == numbers.get("third")) {
            firstThirdEqual = true;
        } else {
            firstThirdEqual = false;
        }

        if (firstSecondEqual && secondThirdEqual && firstThirdEqual) {
            System.out.println("All numbers are equal");
        } else if (!firstSecondEqual && !secondThirdEqual && !firstThirdEqual) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
