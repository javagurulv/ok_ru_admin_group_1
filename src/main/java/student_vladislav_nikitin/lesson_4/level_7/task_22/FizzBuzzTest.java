package student_vladislav_nikitin.lesson_4.level_7.task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.divided3Test();
        fizzBuzzTest.divided5Test();
        fizzBuzzTest.divided3And5Test();

        fizzBuzzTest.randomNumberTest();
        fizzBuzzTest.divide0Test();
    }

    void divided3Test() {
        int number = 9;
        String expectedResult = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (expectedResult.equals(result)) {
            System.out.println("Divided by 3 Test = OK");
        } else {
            System.out.println("Divided by 3 Test = FAIL");
        }
    }

    void divided5Test() {
        int number = 40;
        String expectedResult = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (expectedResult.equals(result)) {
            System.out.println("Divided by 5 Test = OK");
        } else {
            System.out.println("Divided by 5 Test = FAIL");
        }
    }

    void divided3And5Test() {
        int number = 45;
        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (expectedResult.equals(result)) {
            System.out.println("Divided by 3 and 5 Test = OK");
        } else {
            System.out.println("Divided by 3 and 5 Test = FAIL");
        }
    }

    void randomNumberTest() {
        int number = 43;
        String expectedResult = "43";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (expectedResult.equals(result)) {
            System.out.println("Random Number Test = OK");
        } else {
            System.out.println("Random Number Test = FAIL");
        }
    }

    void divide0Test() {
        int number = 0;
        String expectedResult = "0";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (expectedResult.equals(result)) {
            System.out.println("Divide 0 Test = OK");
        } else {
            System.out.println("Divide 0 Test = FAIL");
        }
    }

}
