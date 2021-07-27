package student_vladislav_nikitin.lesson_4.level_6.task_17;

class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void updatePrice(int currentPrice) {
        this.currentPrice = currentPrice;

        if (this.minPrice > currentPrice) {
            this.minPrice = currentPrice;
        }

        if (this.maxPrice < currentPrice) {
            this.maxPrice = currentPrice;
        }
    }

    public String getPriceInformation() {
        String companyInfo = "Company = \"" + this.companyName + "\"";
        String currentPriceInfo = "Current Price = " + this.currentPrice;
        String minPriceInfo = "Min Price = " + this.minPrice;
        String maxPriceInfo = "Max Price = " + this.maxPrice;

        return companyInfo + ", " + currentPriceInfo + ", " + minPriceInfo + ", " + maxPriceInfo;
    }
}
