package student_sergey_egorichev.lesson_4.level_6.task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        createStockTest();
        complexTest();
        maxPriceTest();
        maxPriceUpdateTest();
        maxPriceUpdateTest2();
        maxPriceUpdateTest3();
    }

    static void createStockTest() {
        String expectedName = "Test";
        int expectedPrice = 10;

        Stock stock = new Stock("Test", 10);

        String realName = stock.getCompanyName();
        if (realName.equals(expectedName)) {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (Name):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (Name):", "FAIL");
        }

        int currentPrice = stock.getCurrentPrice();
        if (currentPrice == expectedPrice) {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (current price):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (current price):", "FAIL");
        }

        int minPrice = stock.getMinPrice();
        if (minPrice == expectedPrice) {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (min price):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (min price):", "FAIL");
        }

        int maxPrice = stock.getMaxPrice();
        if (maxPrice == expectedPrice) {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (max price):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[createStockTest] Create Object Test (max price):", "FAIL");
        }
    }

    static void complexTest() {
        int expectedMaxPrice = 99;
        int expectedMinPrice = 5;
        int expectedCurrentPrice = 77;

        Stock stock = new Stock("Test", 10);

        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);

        int currentPrice = stock.getCurrentPrice();
        if (currentPrice == expectedCurrentPrice) {
            System.out.format("%-60s %s\n", "[ComplexTest] Current Price:", "OK");
        } else {
            System.out.format("%-60s %s\n", "[ComplexTest] Current Price:", "FAIL");
        }

        int currentMinPrice = stock.getMinPrice();
        if (currentMinPrice == expectedMinPrice) {
            System.out.format("%-60s %s\n", "[ComplexTest] Min Price:", "OK");
        } else {
            System.out.format("%-60s %s\n", "[ComplexTest] Min Price:", "FAIL");
        }

        int currentMaxPrice = stock.getMaxPrice();
        if (currentMaxPrice == expectedMaxPrice) {
            System.out.format("%-60s %s\n", "[ComplexTest] Max Price:", "OK");
        } else {
            System.out.format("%-60s %s\n", "[ComplexTest] Max Price:", "FAIL");
        }
    }

    static void maxPriceTest() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("Test", 999);
        int currentMaxPrice = stock.getMaxPrice();

        if (currentMaxPrice == expectedMaxPrice) {
            System.out.format("%-60s %s\n", "[maxPriceTest] Max Price:", "OK");
        } else {
            System.out.format("%-60s %s\n", "[maxPriceTest] Max Price:", "FAIL");
        }
    }

    static void maxPriceUpdateTest() {
        int  expectedMaxPrice = 999;
        Stock stock = new Stock("Test", 999);
        stock.updatePrice(1);

        int currentMaxPrice = stock.getMaxPrice();
        if (currentMaxPrice == expectedMaxPrice) {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest] Max Price Update (999->1):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest] Max Price Update (999->1):", "FAIL");
        }
    }

    static void maxPriceUpdateTest2() {
        int  expectedMaxPrice = 1000;
        Stock stock = new Stock("Test", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);

        int currentMaxPrice = stock.getMaxPrice();
        if (currentMaxPrice == expectedMaxPrice) {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest2] Max Price Update (999->2->1000):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest2] Max Price Update (999->2->1000):", "FAIL");
        }
    }

    static void maxPriceUpdateTest3() {
        int  expectedMaxPrice = 1000;
        Stock stock = new Stock("Test", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);

        int currentMaxPrice = stock.getMaxPrice();
        if (currentMaxPrice == expectedMaxPrice) {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest3] Max Price Update (999->2->1000->8):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest3] Max Price Update (999->2->1000->8):", "FAIL");
        }
    }

    static void maxPriceUpdateTest4() {
        int  expectedMaxPrice = 27;
        Stock stock = new Stock("Test", 9);
        stock.updatePrice(27);

        int currentMaxPrice = stock.getMaxPrice();
        if (currentMaxPrice == expectedMaxPrice) {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest4] Max Price Update (9->27):", "OK");
        } else {
            System.out.format("%-60s %s\n", "[maxPriceUpdateTest4] Max Price Update (9->27):", "FAIL");
        }
    }
}
