package student_sergey_egorichev.lesson_10.level_1.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 42, 69));

        // append element to the start of the list
        list.add(0, 99);
        // append element to the end of the list
        list.add(98);

        // get list's length
        System.out.println("Длина списка: " + list.size());

        // remove element by index
        list.remove(2);

        // remove element by value
        list.remove(Integer.valueOf(69));

        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List isn't empty:");

            for (Integer element: list) {
                System.out.println(element);
            }
        }
    }
}
