package student_sergey_egorichev.lesson_10.level_1.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListDemo {
    public static void main(String[] args) {
        // Work
        List<Integer> objectList = new ArrayList(Arrays.asList(10,8,36,50,12));
        System.out.println(objectList);

        // Dosn't work
        // List<int> primitiveList = new ArrayList(Arrays.asList(8, 20, 32, 20, 18));
        // System.out.println(primitiveList);

    }
}
