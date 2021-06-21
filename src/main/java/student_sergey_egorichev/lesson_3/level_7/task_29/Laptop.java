package student_sergey_egorichev.lesson_3.level_7.task_29;

public class Laptop {
    String marufacturer;
    String model;
    String cpuModel;
    String gpu;
    float displaySize;
    boolean replaceableBattery;

    public Laptop(String marufacturer, String model) {
        this.marufacturer = marufacturer;
        this.model = model;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }

    public void setReplaceableBattery(boolean replaceableBattery) {
        this.replaceableBattery = replaceableBattery;
    }
}
