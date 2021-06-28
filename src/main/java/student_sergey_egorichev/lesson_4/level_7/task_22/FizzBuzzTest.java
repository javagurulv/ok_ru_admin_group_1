package student_sergey_egorichev.lesson_4.level_7.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzTest();
        BuzzTest();
        FizzBuzzTest();
        NotFizzBuzzTest();
    }

    static void FizzTest() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(9);

        if (realResult == expectedResult) {
            System.out.format("%-17s %s\n", "Fizz Test:", "OK");
        } else {
            System.out.format("%-17s %s\n", "Fizz Test:", "FAIL");
        }
    }

    static void BuzzTest() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);

        if (realResult == expectedResult) {
            System.out.format("%-17s %s\n", "Buzz Test:", "OK");
        } else {
            System.out.format("%-17s %s\n", "Buzz Test:", "FAIL");
        }
    }

    static void FizzBuzzTest() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);

        if (realResult == expectedResult) {
            System.out.format("%-17s %s\n", "FizzBuzz Test:", "OK");
        } else {
            System.out.format("%-17s %s\n", "FizzBuzz Test:", "FAIL");
        }
    }

    static void NotFizzBuzzTest() {
        String expectedResult = "8";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(8);

        if (realResult.equals(expectedResult)) {
            System.out.format("%-17s %s\n", "NotFizzBuzz Test:", "OK");
        } else {
            System.out.format("%-17s %s\n", "NotFizzBuzz Test:", "FAIL");
        }
    }
}
