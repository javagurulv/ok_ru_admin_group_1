package student_vladislav_nikitin.lesson_9.level_3.task_8;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
