package student_vladislav_nikitin.lesson_9.level_3.task_10;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
