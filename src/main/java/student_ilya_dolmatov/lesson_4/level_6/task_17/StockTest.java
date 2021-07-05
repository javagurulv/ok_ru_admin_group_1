package student_ilya_dolmatov.lesson_4.level_6.task_17;

class StockTest {
    StockTest(){}

    void stock1Test(){
        String companyName = "Mail.ru";
        int currentPrice = 10;

        String expectedResult = "Company Mail.ru, Current Price = " + 77 + ", Min Price = " + 7 + ", Max Price = " + 99;
        Stock testStock = new Stock(companyName, currentPrice);
        testStock.updatePrice(10);
        testStock.updatePrice(12);
        testStock.updatePrice(15);
        testStock.updatePrice(7);
        testStock.updatePrice(99);
        testStock.updatePrice(77);
        String result = testStock.getPriceInformation();
        if (expectedResult.equals(result)) {
            System.out.println("True");
        } else System.out.println("False");
    }

    void stock2Test(){
        String companyName = "Mail.ru";
        int currentPrice = 10;
        String expectedResult = "Max Price = " + 999;
        Stock testStock = new Stock(companyName, currentPrice);
        testStock.updatePrice(999);
        String result = testStock.getPriceInformation().replaceAll(".*Max Price", "Max Price");
        if (expectedResult.equals(result)) {
            System.out.println("True");
        } else System.out.println("False");
    }

    void stock3Test() {
        String companyName = "Mail.ru";
        int currentPrice = 10;
        String expectedResult = "Max Price = " + 1000;
        Stock testStock = new Stock(companyName, currentPrice);
        testStock.updatePrice(999);
        testStock.updatePrice(1);
        testStock.updatePrice(1000);
        String result = testStock.getPriceInformation().replaceAll(".*Max Price", "Max Price");
        if (expectedResult.equals(result)) {
            System.out.println("True");
        } else System.out.println("False");
    }

    void stock4Test() {
        String companyName = "Mail.ru";
        int currentPrice = 10;
        String expectedResult = "Max Price = " + 999;
        Stock testStock = new Stock(companyName, currentPrice);
        testStock.updatePrice(999);
        testStock.updatePrice(1);
        String result = testStock.getPriceInformation().replaceAll(".*Max Price", "Max Price");
        if (expectedResult.equals(result)) {
            System.out.println("True");
        } else System.out.println("False");
    }

    void stock5Test() {
        String companyName = "Mail.ru";
        int currentPrice = 10;
        String expectedResult = "Max Price = " + 999;
        Stock testStock = new Stock(companyName, currentPrice);
        testStock.updatePrice(999);
        testStock.updatePrice(1);
        testStock.updatePrice(8);
        String result = testStock.getPriceInformation().replaceAll(".*Max Price", "Max Price");
        if (expectedResult.equals(result)) {
            System.out.println("True");
        } else System.out.println("False");
    }

    void stock6Test() {
        String companyName = "Mail.ru";
        int currentPrice = 10;
        String expectedResult = "Max Price = " + 27;
        Stock testStock = new Stock(companyName, currentPrice);
        testStock.updatePrice(9);
        testStock.updatePrice(27);
        String result = testStock.getPriceInformation().replaceAll(".*Max Price", "Max Price");
        if (expectedResult.equals(result)) {
            System.out.println("True");
        } else System.out.println("False");
    }
}

