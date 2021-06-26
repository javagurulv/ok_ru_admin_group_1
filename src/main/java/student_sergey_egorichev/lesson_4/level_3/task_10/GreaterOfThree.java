package student_sergey_egorichev.lesson_4.level_3.task_10;

import java.util.*;

public class GreaterOfThree {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(3);

        for (int i = 0; i < 3; i ++) {
            numbers.add(scanner.nextInt());
        }

        /**
         * a>(b|c) || (a=b)>c || ~(a=c)>b~
         * b>(c|a) || (b=c)>a || ~(b=a)>c~
         * c>(a|b) || (c=a)>b || ~(c=b)>a~
         */
        int a = numbers.get(0);
        int b = numbers.get(1);
        int c = numbers.get(2);
        if (((a > b) && (a > c)) ||
                ((a == b) && (a > c))) {
            result = a;
        } else if (((b > c) && (b > a)) ||
                ((b == c) && (b > a))) {
            result = b;
        } else if ((c > a) && (c > b) ||
                ((c == a) && (c > b))) {
            result = c;
        } else {
            result = a;
        }
        System.out.println(result);
    }
}
