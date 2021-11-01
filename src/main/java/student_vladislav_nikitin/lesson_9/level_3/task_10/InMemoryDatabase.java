package student_vladislav_nikitin.lesson_9.level_3.task_10;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    private Product[] products;

    InMemoryDatabase() {
        this.products = new Product[0];
    }

    @Override
    public void save(Product product) {
        Product[] newProducts = Arrays.copyOf(this.products, this.products.length + 1);
        newProducts[newProducts.length - 1] = product;
        this.products = newProducts;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product: this.products) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.ofNullable(null);
    }

}
