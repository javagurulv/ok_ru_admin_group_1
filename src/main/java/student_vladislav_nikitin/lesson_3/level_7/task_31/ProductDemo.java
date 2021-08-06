package student_vladislav_nikitin.lesson_3.level_7.task_31;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Soup");

        product.regularPrice = 40.3;
        product.discount = 25;
        product.printInformation();
    }
}
