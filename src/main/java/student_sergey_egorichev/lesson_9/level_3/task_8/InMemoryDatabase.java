package student_sergey_egorichev.lesson_9.level_3.task_8;

import java.util.Arrays;

class InMemoryDatabase implements ProductDatabase {

    Product[] products;

    @Override
    public void save(Product product) {
        if (products == null) {
            products = new Product[1];
        } else {
            products = Arrays.copyOf(products, products.length + 1);
        }
        products[products.length - 1] = product;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product: products) {
            if (productTitle.equals(product.getTitle())) {
                return product;
            }
        }
        return null;
    }
}
