package student_petr_zaytsev.lesson_4.level_5;

import java.util.Objects;

public class StockTest {
    public static void main(String[] args) {
        init();
        complex_runner();

    }

    static void init(){

        String expectedCompanyName = "google";
        int expectedMax = 100;
        int expectedMin = 1;

        String expectedResult = "Company = google, Current Price = 100, Min Price = 1, Max Price = 100";

        // load some data
        Stock stock = new Stock("google", 50);
        stock.updatePrice(5);
        stock.updatePrice(1);
        stock.updatePrice(100);

        String getName = stock.getCompanyName();

        if (Objects.equals(getName, expectedCompanyName)) {
            System.out.println("OK: expected company name gives match");
        } else {
            System.out.println("FAIL: no match for expected company name");
            System.exit(1);
        }

        String result = stock.getPriceInformation();

        if (Objects.equals(result, expectedResult)) {
            System.out.println("OK: smoke test passed");
        } else {
            System.out.println("FAIL: smoke test failed");
            System.exit(1);
        }

        if (stock.getminPrice() == expectedMin) {
            System.out.println("OK: min test passed");
        } else {
            System.out.println("FAIL: min test failed");
            System.exit(1);
        }

        if (stock.getmaxPrice() == expectedMax) {
            System.out.println("OK: max test passed");
        } else {
            System.out.println("FAIL: max test failed");
            System.exit(1);
        }

        if (stock.getcurrentPrice() == expectedMax) {
            System.out.println("OK: current test passed");
        } else {
            System.out.println("FAIL: current test failed");
            System.exit(1);
        }

    }

    static void complex_runner() {

        int [] firstList = {999};
        complex("google", firstList, 999 );

        int [] secondList = {999, 1};
        complex("google", secondList, 999 );

        int [] thirdList = {999, 2, 1000};
        complex("google", thirdList, 1000 );

        int [] fourthList = {999, 2, 1000, 8};
        complex("google", fourthList, 1000 );

        int [] fifthList = {9, 27};
        complex("google", fifthList, 27 );
    }

    static void complex(String companyName, int [] values, int expectedMax) {


        Stock stock = new Stock(companyName, values[0]);

        // load data
        int i, x;
        for (i = 1; i < values.length; i++) {
            x = values[i];
            stock.updatePrice(x);
        }

        // check
        if (stock.getmaxPrice() == expectedMax) {
            System.out.println("OK: max test passed. Expected " + expectedMax);
        } else {
            System.out.println("FAIL: max test failed. Expected " + expectedMax);
            System.exit(1);
        }

    }

}
