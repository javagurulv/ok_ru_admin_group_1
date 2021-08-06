package student_vladislav_nikitin.lesson_4.level_7.task_22;

class FizzBuzz {

    public String detect(int number) {
        String answer = new String();

        answer = divideBy3(number) ? "Fizz" : "";
        answer += divideBy5(number) ? "Buzz" : "";

        return (isNull(number) || answer.equals("")) ? String.valueOf(number) : answer;
    }

    private boolean divideBy3(int number) {
        return (number % 3) == 0;
    }

    private boolean divideBy5(int number) {
        return (number % 5) == 0;
    }

    private boolean isNull(int number) {
        return number == 0;
    }

}
