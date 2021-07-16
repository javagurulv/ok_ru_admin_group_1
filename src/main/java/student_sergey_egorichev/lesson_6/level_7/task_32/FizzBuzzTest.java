package student_sergey_egorichev.lesson_6.level_7.task_32;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest1();
        FizzBuzzTest2();
        FizzBuzzTest3();
        FizzBuzzTest4();
    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    static void FizzBuzzTest1() {
        FizzBuzz fb = new FizzBuzz();
        checkTestResult("Fizz Buzz (FizzBuzz)",
                fb.detect(15).equals("FizzBuzz"));
    }

    static void FizzBuzzTest2() {
        FizzBuzz fb = new FizzBuzz();
        checkTestResult("Fizz Buzz (Fizz)",
                fb.detect(3).equals("Fizz"));
    }

    static void FizzBuzzTest3() {
        FizzBuzz fb = new FizzBuzz();
        checkTestResult("Fizz Buzz (Buzz)",
                fb.detect(5).equals("Buzz"));
    }

    static void FizzBuzzTest4() {
        FizzBuzz fb = new FizzBuzz();
        checkTestResult("Fizz Buzz (!Fizz !Buzz)",
                fb.detect(8).equals("8"));
    }
}
