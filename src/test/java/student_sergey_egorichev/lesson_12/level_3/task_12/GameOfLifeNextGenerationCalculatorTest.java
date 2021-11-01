package student_sergey_egorichev.lesson_12.level_3.task_12;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    public void calculateTest() {
        boolean[][] currentGeneration = {
                {false, false, false, false},
                {false, false, true, false},
                {false, true, true, false},
                {false, false, false, false}
        };

        boolean[][] expectedGeneration = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, true, false},
                {false, false, false, false}
        };

        GameOfLifeNextGenerationCalculator calc = new GameOfLifeNextGenerationCalculator();

        boolean[][] t = calc.calculate(currentGeneration);

        Assert.assertEquals(calc.calculate(currentGeneration), expectedGeneration);
    }

    @Test
    public void countLiveNeighbours() {
        boolean[][] currentGeneration = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false}
        };

        int realResult = GameOfLifeNextGenerationCalculator.countLiveNeighbours(currentGeneration, 2, 2);

        Assert.assertEquals(2, realResult);
    }

}
