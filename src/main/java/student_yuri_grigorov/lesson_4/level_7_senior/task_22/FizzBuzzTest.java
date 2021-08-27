package student_yuri_grigorov.lesson_4.level_7_senior.task_22;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        doTest(fizzBuzz.detect(2).equals("2"), "Not Fizz Not Buzz");
        doTest(fizzBuzz.detect(3).equals("Fizz"), "Fizz");
        doTest(fizzBuzz.detect(5).equals("Buzz"), "Buzz");
        doTest(fizzBuzz.detect(15).equals("FizzBuzz"), "Fizz And Buzz");
    }

    private static void doTest(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK" : testName + " = FAIL";
        System.out.println(msg);
    }
}
