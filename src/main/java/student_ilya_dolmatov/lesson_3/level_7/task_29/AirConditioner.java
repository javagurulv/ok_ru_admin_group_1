package student_ilya_dolmatov.lesson_3.level_7.task_29;

class AirConditioner {
    String type;
    String vendor;
    int price;
    String color;

    AirConditioner(String type, String vendor, int price, String color) {
        this.type = type;
        this.vendor = vendor;
        this.price = price;
        this.color = color;
    }

    void getACInfo(){
        System.out.println("Type of AC: " + this.type + "\nVendor: " + this.vendor +
                "\nPrice: " + this.price + "\nColor: " + this.color + "\n");
    }
}
