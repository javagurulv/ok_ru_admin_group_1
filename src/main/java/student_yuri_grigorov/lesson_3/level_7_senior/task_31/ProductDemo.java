package student_yuri_grigorov.lesson_3.level_7_senior.task_31;

class ProductDemo {
    public static void main(String[] args) {
        Product banana = new Product("Banana");
        banana.regularPrice = 78;
        banana.discount = 20;
        banana.printInformation();

        Product tomato = new Product("Tomato");
        tomato.regularPrice = 230;
        tomato.discount = 15;
        tomato.printInformation();
    }
}
