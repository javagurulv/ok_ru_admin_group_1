package student_yuri_grigorov.lesson_7.level_3.task_12;

abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public abstract void doAccelerate();

    public abstract void doBreak();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
