package student_maxim_narodovich.lesson_3.level_7.task_31;

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
        return this.regularPrice - (this.regularPrice * this.discount / 100);
    }

    void printInformation() {
        System.out.println("Product name: " + this.name + ", Product regular price: " + this.regularPrice + ", Product discount: " + this.discount);
    }
}
