package student_vladislav_nikitin.lesson_6.level_7.task_32;

class FizzBuzz {

    static public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return String.valueOf(number);
    }

}
