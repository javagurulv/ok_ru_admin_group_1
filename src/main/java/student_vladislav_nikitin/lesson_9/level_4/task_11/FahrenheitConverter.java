package student_vladislav_nikitin.lesson_9.level_4.task_11;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsius) {
        return (9 / 5) * celsius + 32;
    }
}
