package student_sergey_egorichev.lesson_10.level_1.task_1;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        /**
         * ArrayList (обычный массив):
         *    "+": быстрый поиск по индексу (get/set);
         *    "-": медленные вставка(add(i, value)) и удаление(remove) в середину, т.к приходится
         *         "передвигать" все элементы массива.
         */
        List<String> arrayList = new ArrayList<>();
        System.out.println("Начальный размер arrayList: "
                + arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("E");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");

        System.out.println("Размер arrayList после: " + arrayList.size());
        System.out.println("Содержимое arrayList: " + arrayList);
        System.out.println(arrayList.get(0));

        /**
         * LinkedList (связаный список):
         *      "+":  быстрые вставка (add(i, value)) и удаление(remove) в середину, т.к не нужно сдвигать
         *              все элементы, а достаточно переписать ссылки на "соседей".
         *      "-": медленные get()/set(), т.к нужно пройтись по всем предыдущим элементам
         *              чтобы найти то нужный.
         */
        List linkedList = new LinkedList();
        System.out.println("Начальный размер linkedList: "
                + linkedList.size());

        linkedList.add("C");
        linkedList.add("A");
        linkedList.add("E");
        linkedList.add("E");
        linkedList.add(1, "A2");
        linkedList.set(0, "C2");

        System.out.println("Размер linkedList после: " + arrayList.size());
        System.out.println("Содержимое linkedList: " + arrayList);
        System.out.println(arrayList.get(0));

        /**
         * ?Vector?
         */
        List vector = new Vector();
    }
}
