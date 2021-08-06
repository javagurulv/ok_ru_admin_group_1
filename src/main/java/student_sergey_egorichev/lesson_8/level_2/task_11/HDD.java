package student_sergey_egorichev.lesson_8.level_2.task_11;

public class HDD extends Disk {
    private int rpm;

    public HDD(String model, String vendor) {
        super(model, vendor);
    }

    public HDD(String model, String vendor, int rpm) {
        this(model, vendor);
        this.rpm = rpm;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

}
