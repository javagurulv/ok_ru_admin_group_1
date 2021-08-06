package student_yuri_grigorov.lesson_3.level_7_senior.task_31;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Product {
    private String name;
    public double regularPrice;
    public double discount;

    Product(String prodName) {
        name = prodName;
    }

    double actualPrice() {
        return this.regularPrice - this.regularPrice / 100 * this.discount;
    }

    void printInformation() {
        System.out.println(this.name + ": " + this.regularPrice + " (-" + this.discount + "%) " + this.actualPrice());
    }
}
