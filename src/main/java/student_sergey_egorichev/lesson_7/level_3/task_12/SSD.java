package student_sergey_egorichev.lesson_7.level_3.task_12;

public class SSD extends Disk {
    double dwpd;

    public SSD(String vendor, String model, String formFactor, double dwpd) {
        super(vendor, model, formFactor);
        this.dwpd = dwpd;
    }

    public SSD(String vendor, String model) {
        super(vendor, model);
    }

    public void setDwpd(int dwpd) {
        this.dwpd = dwpd;
    }
}
