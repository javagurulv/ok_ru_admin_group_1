package student_sergey_egorichev.lesson_10.level_4.task_27;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinderTest {
    @Test
    public void findTest1() {
        String text = "There is nothing like looking, if you want to find something. You certainly usually find something, if you look, but it is not always quite the something you were after.";

        Assert.assertTrue(UniqueWordFinder.find(text).size() == 22);

    }

    @Test
    public void findTest2() {
        String text = "There is nothing like looking, if you want to find something. You certainly usually find something, if you look, but it is not always quite the something you were after.";

        Set<String> expectedResult = new HashSet<>(Arrays.asList("but", "not", "find", "quite", "usually", "after", "if",
                "you", "always", "certainly", "like", "nothing", "want", "is", "it", "look", "something", "the", "were",
                "there", "looking", "to"));
        Assert.assertTrue(UniqueWordFinder.find(text).equals(expectedResult));

    }
}
