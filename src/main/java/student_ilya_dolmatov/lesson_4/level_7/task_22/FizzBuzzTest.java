package student_ilya_dolmatov.lesson_4.level_7.task_22;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.buzzTest();
        test.fizzTest();
        test.notFizzBuzzTest();
    }
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("Test fizzBuzzTest = OK");
        } else {
            System.out.println("Test fizzBuzzTest = FAIL");
        }
    }

    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(5).equals("Buzz")) {
            System.out.println("Test buzzTest = OK");
        } else {
            System.out.println("Test buzzTest = FAIL");
        }
    }

    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(3).equals("Fizz")) {
            System.out.println("Test fizzTest = OK");
        } else {
            System.out.println("Test fizzTest = FAIL");
        }
    }

    public void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        if (fizzBuzz.detect(number).equals("" + number)) {
            System.out.println("Test notFizzBuzzTest = OK");
        } else {
            System.out.println("Test notFizzBuzzTest = FAIL");
        }
    }

}
