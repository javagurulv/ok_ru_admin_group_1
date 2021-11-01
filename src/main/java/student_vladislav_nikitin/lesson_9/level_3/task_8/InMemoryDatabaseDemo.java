package student_vladislav_nikitin.lesson_9.level_3.task_8;

class InMemoryDatabaseDemo {

    public static void main(String[] args) {
        ProductDatabase database = new InMemoryDatabase();
        database.save(new Product("Apple"));
        database.save(new Product("Orange"));
        database.save(new Product("Carrot"));
        database.save(new Product("Apple"));
        database.save(new Product("Cheese"));

        Product apple = database.findByTitle("Apple");
        if (apple != null) {
            System.out.println("Found " + apple.getTitle());
        }

        Product cheese = database.findByTitle("Cheese");
        if (cheese != null) {
            System.out.println("Found " + cheese.getTitle());
        }
    }

}
