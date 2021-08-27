package student_yuri_grigorov.lesson_4.level_7_senior.task_22;

class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.detect(2));
        System.out.println(fb.detect(3));
        System.out.println(fb.detect(5));
        System.out.println(fb.detect(15));
    }

    public String detect(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        } else if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
