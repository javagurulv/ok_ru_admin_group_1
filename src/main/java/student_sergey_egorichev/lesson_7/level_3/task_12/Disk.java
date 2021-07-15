package student_sergey_egorichev.lesson_7.level_3.task_12;

abstract class Disk {
    String vendor;
    String model;
    String formFactor;

    public Disk(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    public Disk(String vendor, String model, String formFactor) {
        this.vendor = vendor;
        this.model = model;
        this.formFactor = formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}
