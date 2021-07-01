package student_ilya_dolmatov.lesson_4.level_7.task_22;


class FizzBuzz {
    int number;
    String result;

    FizzBuzz() {}

    public String detect(int number) {
        this.number = number;

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else result = "" + number;

    return result;
    }
}
