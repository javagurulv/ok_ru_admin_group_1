package student_ivan_buymov.lesson_12.level_5.task_26_32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import student_ivan_buymov.lesson_12.level_5.task_26_32.StringCalculatorExceptions.IncorrectInputFormat;



public class StringCalculator {

    String[] getDelimeters(String str) {
        return new String[]{""};
    }

    int add(String numbers) throws IncorrectInputFormat {

        if (numbers.length() == 0) {
            return 0;
        }
        System.out.println("input: " + numbers);
        var firstLine = numbers.split("\n")[0];
        System.out.println("fist line: " + firstLine);
        String []delimiters = {};
        if (firstLine.startsWith("//")) {
            firstLine = firstLine.substring(3, firstLine.length() - 1);
            System.out.println("got delimiters from fist line: " + firstLine);
            delimiters = firstLine.split("\\]\\[");
        }
        List<String> delimitersList = new java.util.ArrayList<>(Arrays.stream(delimiters).toList());
        delimitersList.add("\\n");
        delimitersList.add(",");
        System.out.println("using delimiters: " + delimitersList);
        String[] numbersStrList;
        int sum = 0;
        numbers = numbers.trim();
        if (numbers.startsWith("//")) {
            numbers = numbers.substring(numbers.indexOf("\n"+1));
        }
        numbers = numbers.trim();
        System.out.println("numbers " + numbers);
        String delimitersStr = String.join("|", delimitersList);
        System.out.println("delimiters: " + delimitersStr);
        System.out.println();
        String delimitersStrEscaped = "";
        for (int i = 0; i < delimitersStr.length(); i++) {
            // TODO: escape other special chars too
            if (delimitersStr.charAt(i) == '.') {
                delimitersStrEscaped += "\\" + delimitersStr.charAt(i);
            } else {
                delimitersStrEscaped += delimitersStr.charAt(i);
            }
        }
        System.out.println("escaped delimiters: " + delimitersStrEscaped);
        numbersStrList = numbers.split(delimitersStrEscaped);
        System.out.println("numbersStrList: " + Arrays.stream(numbersStrList).toList());
        List<Integer> numbersList;
        try {
            numbersList = Arrays.stream(numbersStrList).map(Integer::parseInt).collect(Collectors.toList());
        }  catch (Exception e) {
            throw new IncorrectInputFormat("must contain separators and integers, got: " + numbers + ", err: " + e.getMessage());
        }

        System.out.println(numbersList);

            for (Integer n : numbersList) {
                sum += n;
            }

        return sum;
    };

}
