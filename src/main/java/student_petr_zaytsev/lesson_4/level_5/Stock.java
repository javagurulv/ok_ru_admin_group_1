package student_petr_zaytsev.lesson_4.level_5;

public class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;


    Stock(String companyName, int newValue) {
        this.companyName = companyName;
        this.currentPrice = this.minPrice = this.maxPrice = newValue;
    }

    public void updatePrice(int newValue){
        this.currentPrice = newValue;

        if (newValue > maxPrice) {
            this.maxPrice = newValue;
        }
        else if (newValue< minPrice) {
            this.minPrice = newValue;
        }
    }

    public String getCompanyName(){
        return companyName;
    }

    public int getminPrice() {
        return minPrice;
    }

    public int getmaxPrice() {
        return maxPrice;
    }

    public int getcurrentPrice() {
        return currentPrice;
    }

    public String getPriceInformation(){

        // form proper output
        String partOne = "Company = " + companyName + ", ";
        String partTwo = "Current Price = " + currentPrice + ", ";
        String partTree = "Min Price = " + minPrice + ", ";
        String partFour = "Max Price = " + maxPrice;


        return partOne + partTwo + partTree + partFour;

    }
}
