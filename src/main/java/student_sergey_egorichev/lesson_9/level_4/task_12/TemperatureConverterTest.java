package student_sergey_egorichev.lesson_9.level_4.task_12;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitTemperatureConverter1 () {
        TemperatureConverter converter = new FahrenheitTemperatureConverter();
        float sourceTemp = 29;
        float expectedTemp = (float) 84.2;
        Assert.assertTrue(expectedTemp == converter.convert(sourceTemp));
    }

    @Test
    public void testFahrenheitTemperatureConverter2 () {
        TemperatureConverter converter = new FahrenheitTemperatureConverter();
        float sourceTemp = 29;
        float expectedTemp = (float) 83.2;
        Assert.assertFalse(expectedTemp == converter.convert(sourceTemp));
    }

    @Test
    public void testKelvinTemperatureConverter1 () {
        TemperatureConverter converter = new KelvinTemperatureConverter();
        float sourceTemp = 29;
        float expectedTemp = (float) 302.15;
        Assert.assertTrue(expectedTemp == converter.convert(sourceTemp));
    }

    @Test
    public void testKelvinTemperatureConverter2 () {
        TemperatureConverter converter = new KelvinTemperatureConverter();
        float sourceTemp = 29;
        float expectedTemp = (float) 83.2;
        Assert.assertFalse(expectedTemp == converter.convert(sourceTemp));
    }

}
