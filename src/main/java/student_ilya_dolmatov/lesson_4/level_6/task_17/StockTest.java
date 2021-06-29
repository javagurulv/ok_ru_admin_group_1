package student_ilya_dolmatov.lesson_4.level_6.task_17;

class StockTest {
    StockTest(){}
//
//    10 -> 12 -> 5 -> 7 -> 99 -> 77
//
//    Test case max:
//
//    Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
//    Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
//    Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
//    Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
//    Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
    void stockCasualTest(){
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
        if (expectedResult == result) {
            System.out.println("True");
        } else System.out.println("False");
        System.out.println(result + "\n" + expectedResult);
    }
}
