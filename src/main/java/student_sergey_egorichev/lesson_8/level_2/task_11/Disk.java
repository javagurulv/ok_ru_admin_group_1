package student_sergey_egorichev.lesson_8.level_2.task_11;

class Disk {
    private String model;
    private String vendor;

    protected Disk(String model) {
        this.model = model;
    }

    protected Disk(String model, String vendor) {
        this(model);
        this.vendor = vendor;
    }

    String getModel() {
        return model;
    }

    String getVendor() {
        return vendor;
    }

    void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
