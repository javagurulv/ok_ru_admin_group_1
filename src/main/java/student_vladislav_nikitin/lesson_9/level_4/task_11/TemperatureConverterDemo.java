package student_vladislav_nikitin.lesson_9.level_4.task_11;

class TemperatureConverterDemo {

    public static void main(String[] args) {
        double celsius = 42;

        // class implementations
        TemperatureConverter toFahrenheitClass = new FahrenheitConverter();
        TemperatureConverter toKelvinClass = new KelvinConverter();
        System.out.println(celsius + " °C to °F = " + toFahrenheitClass.convert(celsius));
        System.out.println(celsius + " °C to K = " + toKelvinClass.convert(celsius));

        // lambda implementations
        TemperatureConverter toFahrenheitLambda = (value) -> (9 / 5) * value + 32;
        TemperatureConverter toKelvinLambda = (value) -> value + 273.15;
        System.out.println(celsius + " °C to °F = " + toFahrenheitLambda.convert(celsius));
        System.out.println(celsius + " °C to K = " + toKelvinLambda.convert(celsius));

    }

}
