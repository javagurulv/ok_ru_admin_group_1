package student_maxim_narodovich.lesson_4.level_6.task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.nameTest();
        stockTest.currentPriceTest();
        stockTest.minimumPriceTest();
        stockTest.maximumPriceTest();
        stockTest.priceInformationTest();
    }
    void nameTest() {
        String companyName = "IBM";
        int currentPrice = 17;
        String expectedResult = "IBM";
        Stock stock = new Stock(companyName, currentPrice);
        String realResult = stock.getCompanyName();
        if (realResult == expectedResult) {
            System.out.println("Company name test = OK");
        } else {
            System.out.println("Company name test = FAIL");
        }
    }
    void currentPriceTest() {
        String companyName = "IBM";
        int currentPrice = 17;
        int expectedResult = 17;
        Stock stock = new Stock(companyName, currentPrice);
        int realResult = stock.getCurrentPrice();
        if (realResult == expectedResult) {
            System.out.println("Current price test = OK");
        } else {
            System.out.println("Current price test = FAIL");
        }
    }

    void minimumPriceTest() {
        String companyName = "IBM";
        int currentPrice = 17;
        int expectedResult = 7;
        Stock stock = new Stock(companyName, currentPrice);
        stock.updatePrice(7);
        stock.updatePrice(32);
        int realResult = stock.getMinimumPrice();
        if (realResult == expectedResult) {
            System.out.println("Minimum price test = OK");
        } else {
            System.out.println("Minimum price test = FAIL");
        }
    }

    void maximumPriceTest() {
        String companyName = "IBM";
        int currentPrice = 17;
        int expectedResult = 42;
        Stock stock = new Stock(companyName, currentPrice);
        stock.updatePrice(7);
        stock.updatePrice(42);
        stock.updatePrice(12);
        int realResult = stock.getMaximumPrice();
        if (realResult == expectedResult) {
            System.out.println("Maximum price test = OK");
        } else {
            System.out.println("Maximum price test = FAIL");
        }
    }

    void priceInformationTest() {
        String companyName = "IBM";
        int currentPrice = 17;
        String expectedResult = "Company = \"IBM\", Current Price = 12, Min Price = 7, Max Price = 42";
        Stock stock = new Stock(companyName, currentPrice);
        stock.updatePrice(7);
        stock.updatePrice(42);
        stock.updatePrice(12);
        String realResult = stock.getPriceInformation();
        if (realResult.equals(expectedResult)) {
            System.out.println("Price Information test = OK");
        } else {
            System.out.println("Price Information test = FAIL");
        }
    }
}
