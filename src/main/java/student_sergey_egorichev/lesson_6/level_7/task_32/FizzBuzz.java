package student_sergey_egorichev.lesson_6.level_7.task_32;

public class FizzBuzz {

    public String detect(int number) {
        boolean fizz = (number % 3 == 0);
        boolean buzz = (number % 5 == 0);

        if (fizz && buzz) return "FizzBuzz";
        else if (fizz) return "Fizz";
        else if (buzz) return "Buzz";
        else return "" + number;
    }

}
