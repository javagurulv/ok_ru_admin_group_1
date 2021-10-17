package student_sergey_egorichev.lesson_10.level_4.task_27;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class UniqueWordFinder {
    public static Set<String> find(String text) {
        return new HashSet<String>(List.of(text.replaceAll("[^A-Za-z0-9' ]", "").toLowerCase().replaceAll(" +", " ").split(" ")));
    }
}
