package student_yuri_grigorov.lesson_4.level_6_middle.task_17;

class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.createStockTest();
        stockTest.updatePriceTest();
        stockTest.maxPriceTest1();
        stockTest.maxPriceTest2();
        stockTest.maxPriceTest3();
        stockTest.maxPriceTest4();
        stockTest.maxPriceTest5();

    }

    private void createStockTest() {
        String expectedCompanyName = "Foo";
        int expectedPrice = 50;
        Stock stock = new Stock("Foo", 50);
        doTest(stock.companyName.equals(expectedCompanyName), "Test Stock constructor: companyName");
        doTest(stock.getCurrentPrice() == expectedPrice, "Test Stock constructor: currentPrice");
        doTest(stock.getMinPrice() == expectedPrice, "Test Stock constructor: minPrice");
        doTest(stock.getMaxPrice() == expectedPrice, "Test Stock constructor: maxPrice");
    }

    private void updatePriceTest() {
        int expectedMinPrice = 5;
        int expectedMaxPrice = 99;
        Stock stock = new Stock("Foo", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        doTest(stock.getMinPrice() == expectedMinPrice, "Test Stock.updatePrice: minPrice");
        doTest(stock.getMaxPrice() == expectedMaxPrice, "Test Stock.updatePrice: maxPrice");
    }

    private void maxPriceTest1() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("Foo", 999);
        doTest(stock.getMaxPrice() == expectedMaxPrice, "Test Stock initial maxPrice");
    }

    private void maxPriceTest2() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("Foo", 999);
        stock.updatePrice(1);
        doTest(stock.getMaxPrice() == expectedMaxPrice, "Test Stock.updatePrice 999->1");
    }

    private void maxPriceTest3() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("Foo", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        doTest(stock.getMaxPrice() == expectedMaxPrice, "Test Stock.updatePrice 999->1->1000");
    }

    private void maxPriceTest4() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("Foo", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        doTest(stock.getMaxPrice() == expectedMaxPrice, "Test Stock.updatePrice 999->1->1000->8");
    }

    private void maxPriceTest5() {
        int expectedMaxPrice = 27;
        Stock stock = new Stock("Foo", 9);
        stock.updatePrice(27);
        doTest(stock.getMaxPrice() == expectedMaxPrice, "Test Stock.updatePrice 9->27");
    }

    private void doTest(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK" : testName + " = FAIL";
        System.out.println(msg);
    }
}
