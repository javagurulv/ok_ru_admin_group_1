package student_ilya_dolmatov.lesson_3.level_7.task_31;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Book");
        product1.getRegularPrice(200.99);
        product1.getDiscount(25.0);

        Product product2 = new Product("Table");
        product2.getRegularPrice(5700.99);
        product2.getDiscount(500.0);

        Product product3 = new Product("Gold Bar");
        product3.getRegularPrice(100500.0);
        product3.getDiscount(0.99);

        product1.printInformation();
        product2.printInformation();
        product3.printInformation();
    }
}
