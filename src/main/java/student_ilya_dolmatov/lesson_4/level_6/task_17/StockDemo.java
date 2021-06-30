package student_ilya_dolmatov.lesson_4.level_6.task_17;

// Still in progress with tests ... =(
class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        System.out.println("\nStart tests!");
        StockTest test1 = new StockTest();
        test1.stock1Test();
        test1.stock2Test();
        test1.stock3Test();
        test1.stock4Test();
        test1.stock5Test();
        test1.stock6Test();

    }
}
