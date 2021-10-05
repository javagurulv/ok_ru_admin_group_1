package student_sergey_egorichev.lesson_9.level_3.task_9;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> someString;
        Optional<String> nullString;

        someString = Optional.of("test");
        nullString = Optional.ofNullable(null);

        checkOptional(someString);
        checkOptional(nullString);

    }

    static void checkOptional(Optional<String> str) {
        if (str.isPresent()) {
            System.out.println("Contains value: " + str.get());
        } else {
            System.out.println("Is null.");
        }
    }
}
