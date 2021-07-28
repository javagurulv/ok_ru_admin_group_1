package student_sergey_egorichev.lesson_7.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class HDD extends Disk {
    int rpm;

    public HDD(String vendor, String model, String formFactor, int rpm) {
        super(vendor, model, formFactor);
        this.rpm = rpm;
    }

    public HDD(String vendor, String model) {
        super(vendor, model);
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
