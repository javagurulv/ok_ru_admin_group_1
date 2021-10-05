package student_sergey_egorichev.lesson_9.level_3.task_8;

public class InMemoryDatabaseDemo {
    public static void main(String[] args) {
        InMemoryDatabase database = new InMemoryDatabase();

        database.save(new Product("first"));
        database.save(new Product("second"));

        Product nProduct = database.findByTitle("second");
        Product nProduct2 = database.findByTitle("third");
    }
}
