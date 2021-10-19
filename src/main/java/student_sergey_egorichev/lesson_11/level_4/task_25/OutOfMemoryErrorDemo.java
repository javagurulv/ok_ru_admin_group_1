package student_sergey_egorichev.lesson_11.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        while (true) {
            lst.add(Integer.MAX_VALUE);
        }
    }
}
