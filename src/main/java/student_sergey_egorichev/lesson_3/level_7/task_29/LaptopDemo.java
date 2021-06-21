package student_sergey_egorichev.lesson_3.level_7.task_29;

public class LaptopDemo {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Asus", "Rog Strix 15");

        laptop1.setCpuModel("i7");
        laptop1.setDisplaySize(15.4F);
        laptop1.setGpu("RTX2070");
        laptop1.setReplaceableBattery(false);

        System.out.println("Brand: " + laptop1.marufacturer);
        System.out.println("Model: " + laptop1.model);
        System.out.println("CPU: " + laptop1.cpuModel);
        System.out.println("Display: " + laptop1.displaySize);
        System.out.println("GPU: " + laptop1.gpu);
        System.out.println("Replaceable Battery: " + laptop1.replaceableBattery);

    }
}
