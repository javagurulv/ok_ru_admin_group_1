package student_vladislav_nikitin.lesson_4.level_6.task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();

        stockTest.complexTest();

        stockTest.maxTest0();
        stockTest.maxTest1();
        stockTest.maxTest2();
        stockTest.maxTest3();
        stockTest.maxTest4();
    }

    void complexTest() {
        String expectedCompanyName = "Test";
        int expectedCurrentPrice = 77;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 99;
        String expectedPriceInformation = "Company = \"Test\", Current Price = 77, Min Price = 5, Max Price = 99";

        Stock testStock = new Stock("Test", 10);
        testStock.updatePrice(12);
        testStock.updatePrice(5);
        testStock.updatePrice(7);
        testStock.updatePrice(99);
        testStock.updatePrice(77);

        String companyName = testStock.getCompanyName();
        if (companyName.equals(expectedCompanyName)) {
            System.out.println("[Complex Test]: company name = OK");
        } else {
            System.out.println("[Complex Test]: company name = FAIL ");
        }

        int currentPrice = testStock.getCurrentPrice();
        if (currentPrice == expectedCurrentPrice) {
            System.out.println("[Complex Test]: current price = OK");
        } else {
            System.out.println("[Complex Test]: current price = FAIL ");
        }

        int minPrice = testStock.getMinPrice();
        if (minPrice == expectedMinPrice) {
            System.out.println("[Complex Test]: min price = OK");
        } else {
            System.out.println("[Complex Test]: min price = FAIL ");
        }

        int maxPrice = testStock.getMaxPrice();
        if (maxPrice == expectedMaxPrice) {
            System.out.println("[Complex Test]: max price = OK");
        } else {
            System.out.println("[Complex Test]: max price = FAIL ");
        }

        String priceInformation = testStock.getPriceInformation();
        if (priceInformation.equals(expectedPriceInformation)) {
            System.out.println("[Complex Test]: price information = OK");
        } else {
            System.out.println("[Complex Test]: price information = FAIL ");
        }
    }

    void maxTest0() {
        int expectedMaxPrice = 999;

        Stock testStock = new Stock("Test", 0);
        testStock.updatePrice(999);

        int maxPrice = testStock.getMaxPrice();
        if (maxPrice == expectedMaxPrice) {
            System.out.println("[Max Test 0]: max price = OK");
        } else {
            System.out.println("[Max Test 0]: max price = FAIL ");
        }
    }

    void maxTest1() {
        int expectedMaxPrice = 999;

        Stock testStock = new Stock("Test", 0);
        testStock.updatePrice(999);
        testStock.updatePrice(1);

        int maxPrice = testStock.getMaxPrice();
        if (maxPrice == expectedMaxPrice) {
            System.out.println("[Max Test 1]: max price = OK");
        } else {
            System.out.println("[Max Test 1]: max price = FAIL ");
        }
    }

    void maxTest2() {
        int expectedMaxPrice = 1000;

        Stock testStock = new Stock("Test", 0);
        testStock.updatePrice(999);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);

        int maxPrice = testStock.getMaxPrice();
        if (maxPrice == expectedMaxPrice) {
            System.out.println("[Max Test 2]: max price = OK");
        } else {
            System.out.println("[Max Test 2]: max price = FAIL ");
        }
    }

    void maxTest3() {
        int expectedMaxPrice = 1000;

        Stock testStock = new Stock("Test", 0);
        testStock.updatePrice(999);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);
        testStock.updatePrice(8);

        int maxPrice = testStock.getMaxPrice();
        if (maxPrice == expectedMaxPrice) {
            System.out.println("[Max Test 3]: max price = OK");
        } else {
            System.out.println("[Max Test 3]: max price = FAIL ");
        }
    }

    void maxTest4() {
        int expectedMaxPrice = 27;

        Stock testStock = new Stock("Test", 0);
        testStock.updatePrice(9);
        testStock.updatePrice(27);

        int maxPrice = testStock.getMaxPrice();
        if (maxPrice == expectedMaxPrice) {
            System.out.println("[Max Test 4]: max price = OK");
        } else {
            System.out.println("[Max Test 4]: max price = FAIL ");
        }
    }
}
