package student_sergey_egorichev.lesson_9.level_1.task_3;

public interface MyList {

    /**
     * Append new element to the end of the list
     */
    boolean append(Object o);

    /**
     * Remove the element from the list
     */
    boolean remove(Object o);

    /**
     * Compares two objects. Returns true if they are equals,
     * or false if different.
     */
    boolean equals(Object o);

    /**
     * Returns true if the list contains no elements.
     */
    boolean isEmpty();

    /**
     * Returns list size
     */
    int size();

}

