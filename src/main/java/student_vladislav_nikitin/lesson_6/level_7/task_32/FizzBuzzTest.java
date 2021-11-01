package student_vladislav_nikitin.lesson_6.level_7.task_32;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.fizzBuzzDivided3Test();
        fizzBuzzTest.fizzBuzzDivided5Test();
        fizzBuzzTest.fizzBuzzDivided3And5Test();
        fizzBuzzTest.fizzBuzzNotDivided3Or5Test();
    }

    void fizzBuzzDivided3Test() {
        int inputNumber = 6;
        String expectedResult = "Fizz";
        String result = FizzBuzz.detect(inputNumber);

        testResult(expectedResult.equals(result), "FizzBuzz divided 3, give Fizz");
    }

    void fizzBuzzDivided5Test() {
        int inputNumber = 10;
        String expectedResult = "Buzz";
        String result = FizzBuzz.detect(inputNumber);

        testResult(expectedResult.equals(result), "FizzBuzz divided 5, give Buzz");
    }

    void fizzBuzzDivided3And5Test() {
        int inputNumber = 15;
        String expectedResult = "FizzBuzz";
        String result = FizzBuzz.detect(inputNumber);

        testResult(expectedResult.equals(result), "FizzBuzz divided 3 and 5, give FizzBuzz");
    }

    void fizzBuzzNotDivided3Or5Test() {
        int inputNumber = 4;
        String expectedResult = "4";
        String result = FizzBuzz.detect(inputNumber);

        testResult(expectedResult.equals(result), "FizzBuzz not divided 3 or 5, give ordinary number");
    }

    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
