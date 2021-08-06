package student_ilya_dolmatov.lesson_3.level_7.task_31;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    String name;
    Double regularPrice = 99999.0;
    Double discount = 0.0;

    Product(String name) {
        this.name = name;
    }

    Double getRegularPrice(Double newPrice){
        this.regularPrice = newPrice;
        return this.regularPrice;
    }

    Double getDiscount(Double newDiscount){
        this.discount = newDiscount;
        return this.discount;
    }

    void printInformation(){
        System.out.println("\nName: " + this.name + "\nActual price: " + this.regularPrice + "$" +
                "\nDiscount: " + this.discount + "$" +
                "\nTotal price: " + (this.regularPrice - this.discount) + "$");
    }

}
