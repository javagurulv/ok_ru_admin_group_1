package student_vladislav_nikitin.lesson_9.level_3.task_10;

import java.util.Optional;

class InMemoryDatabaseDemo {

    public static void main(String[] args) {
        ProductDatabase database = new InMemoryDatabase();
        database.save(new Product("Apple"));
        database.save(new Product("Orange"));
        database.save(new Product("Carrot"));
        database.save(new Product("Apple"));
        database.save(new Product("Cheese"));

        Optional<Product> apple = database.findByTitle("Apple");
        apple.ifPresent(product -> System.out.println("Found " + product.getTitle()));

        Optional<Product> cheese = database.findByTitle("Cheese");
        cheese.ifPresent(product -> System.out.println("Found " + product.getTitle()));
    }

}
