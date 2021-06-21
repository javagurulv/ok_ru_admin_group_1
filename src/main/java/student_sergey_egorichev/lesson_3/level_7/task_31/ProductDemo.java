package student_sergey_egorichev.lesson_3.level_7.task_31;

public class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Socks");

        product.setRegularPrice(451);
        product.setDiscount(30);

        product.printInformation();

    }

}
