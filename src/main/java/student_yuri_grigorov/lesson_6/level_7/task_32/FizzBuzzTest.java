package student_yuri_grigorov.lesson_6.level_7.task_32;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testNotFizzNotBuzz();
    }

    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        int inputValue = 6;
        checkTestResult(fizzBuzz.detect(inputValue).equals(expectedResult), "testFizz");
    }

    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        int inputValue = 10;
        checkTestResult(fizzBuzz.detect(inputValue).equals(expectedResult), "testBuzz");
    }

    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        int inputValue = 15;
        checkTestResult(fizzBuzz.detect(inputValue).equals(expectedResult), "testFizzBuzz");
    }

    public void testNotFizzNotBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "1";
        int inputValue = 1;
        checkTestResult(fizzBuzz.detect(inputValue).equals(expectedResult), "testNotFizzNotBuzz");
    }


    private void checkTestResult(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK!" : testName + " = FAIL!";
        System.out.println(msg);
    }
}
