package student_sergey_egorichev.lesson_12.level_3.task_11;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    public void calculateTest() {
        boolean[][] currentGeneration = {
                {false, false, false, false},
                {false, false, true, false},
                {false, true, false, false},
                {false, false, false, false}
        };

        boolean[][] expectedGeneration = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };

        Assert.assertTrue(currentGeneration.equals(expectedGeneration));
    }

}
