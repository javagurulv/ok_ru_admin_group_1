package student_ivan_buymov.lesson_12.level_5.task_26_32;

import org.junit.Test;

public class StringCalculatorTest {

    StringCalculator sc = new StringCalculator();

    @Test
    public void testCoplicatedInput() throws StringCalculatorExceptions.IncorrectInputFormat {
        StringCalculator sc = new StringCalculator();
        assert sc.add("//[;][.]\n1.2;3\n1") == 7;
        assert sc.add("//[@][;]\n1@2;3@1") == 7;
        assert sc.add("//[;][.][ ]\n1.2;3\n1 1 1") == 9;
        assert sc.add("//[;][&]\n1;2&3") == 6;
    }


    @Test
    public void addTestCorrectInput() throws StringCalculatorExceptions.IncorrectInputFormat {
        assert sc.add("") == 0;
        assert sc.add("1") == 1;
        assert sc.add("1,2") == 3;
        assert sc.add("-1") == -1;
        assert sc.add("-1\n2") == 1;
        assert sc.add("1\n2,3") == 6;
        assert sc.add("1\n2\n3") == 6;
        assert sc.add("\n2\n3") == 5;
    }

    @Test(expected = StringCalculatorExceptions.IncorrectInputFormat.class)
    public void addTestBadInput() throws StringCalculatorExceptions.IncorrectInputFormat {
        sc.add("1,.2");
    }

}