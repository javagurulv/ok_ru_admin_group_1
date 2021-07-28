package student_maxim_narodovich.lesson_3.level_7.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product rice = new Product("rice");
        rice.setDiscount(15);
        rice.setRegularPrice(130);
        rice.printInformation();
        System.out.println("Actual price of " + rice.name + " is " + rice.actualPrice());
    }
}
