package student_sergey_egorichev.lesson_3.level_7.task_31;

import java.io.PrintStream;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        return regularPrice - regularPrice * discount / 100;
    }

    public void printInformation() {

        System.out.format("""
                        Product: %16s
                        Regular Price: %10s
                        Discount: %15s
                        Actual Price: %11s""",
                this.name, this.regularPrice,
                this.discount, this.actualPrice());

    }

}
