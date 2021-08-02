package student_ivan_buymov.lesson_4.level_6.task_17;
import java.lang.Float;

public class StockTest {
    public static void main(String[] args) {

        var mail = new Stock("MAIL", 20.70f);

        mail.printPriceInformation();

        mail.updatePrice(21.5f);
        mail.updatePrice(19.8f);
        mail.updatePrice(22.1f);

        mail.printPriceInformation();

        runTests();

    }

    static void runTests(){

        System.out.println("Tests result:");

        // Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
        var expectedMaxPrice = 27f;
        var stock = new Stock("FAKE", 9f);
        stock.updatePrice(expectedMaxPrice);
        var maxPrice = stock.getMaxPrice();
        if (maxPrice.equals(expectedMaxPrice)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL: max price should be " + expectedMaxPrice);
        }

        // Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
        expectedMaxPrice = 999f;
        stock.updatePrice(expectedMaxPrice);
        maxPrice = stock.getMaxPrice();
        if (maxPrice.equals(expectedMaxPrice)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL: max price should be " + expectedMaxPrice);
        }



        // Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
        var expectedMinPrice = 1f;
        stock.updatePrice(1f);
        var minPrice = stock.getMinPrice();
        if (minPrice.equals(expectedMinPrice)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL: min price should be " + expectedMinPrice);
        }

        // Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
        expectedMaxPrice = 1000f;
        stock.updatePrice(999f);
        stock.updatePrice(2f);
        stock.updatePrice(expectedMaxPrice);
        maxPrice = stock.getMaxPrice();
        if (maxPrice.equals(expectedMaxPrice)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL: max price should be " + expectedMaxPrice);
        }

        // Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
        expectedMaxPrice = 1000f;
        stock.updatePrice(999f);
        stock.updatePrice(2f);
        stock.updatePrice(expectedMaxPrice);
        stock.updatePrice(8f);
        maxPrice = stock.getMaxPrice();
        if (maxPrice.equals(expectedMaxPrice)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL: max price should be " + expectedMaxPrice);
        }




    }
}