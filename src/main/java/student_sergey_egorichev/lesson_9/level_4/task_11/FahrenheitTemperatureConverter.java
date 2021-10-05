package student_sergey_egorichev.lesson_9.level_4.task_11;

class FahrenheitTemperatureConverter implements TemperatureConverter {
    @Override
    public float convert(float temperature) {
        return (temperature * 9/5) + 32;
    }
}
