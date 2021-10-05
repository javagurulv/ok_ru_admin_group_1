package student_sergey_egorichev.lesson_9.level_4.task_11;

class KelvinTemperatureConverter implements TemperatureConverter {
    @Override
    public float convert(float temperature) {
        return (float) (temperature + 273.15);
    }
}
