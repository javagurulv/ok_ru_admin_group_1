package student_vladislav_nikitin.lesson_3.level_7.task_31;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    private String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    double actualPrice () {
        return this.regularPrice - (this.regularPrice * (this.discount / 100));
    }

    void printInformation () {
        String info = "Regular price of " + this.name + " is " + this.regularPrice +
                ". Actual price with discount " + this.discount + "% is " + actualPrice() + ".";
        System.out.println(info);
    }
}
