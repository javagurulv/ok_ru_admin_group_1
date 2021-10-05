package student_sergey_egorichev.lesson_9.level_4.task_12;

public class TemperatureConverterDemo {
    public static void main(String[] args) {
        TemperatureConverter celsiusToKelvin = new KelvinTemperatureConverter();
        TemperatureConverter celsiusToFahrenheit = new FahrenheitTemperatureConverter();

        int sourceTemp = 29;

        System.out.println("Celsius: " + sourceTemp);
        System.out.println("Fahrenheit: " + celsiusToFahrenheit.convert(sourceTemp));
        System.out.println("Kelvin: " + celsiusToKelvin.convert(sourceTemp));
    }
}
