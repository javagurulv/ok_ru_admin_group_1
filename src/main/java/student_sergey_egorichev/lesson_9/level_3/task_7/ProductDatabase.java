package student_sergey_egorichev.lesson_9.level_3.task_7;

/**
 * Вопрос: Является ли следующий интерфейс функциональным?
 *
 * Ответ: Нет, не является.
 */
interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}