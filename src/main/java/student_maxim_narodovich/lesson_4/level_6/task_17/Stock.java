package student_maxim_narodovich.lesson_4.level_6.task_17;

class Stock {
    String companyName;
    int currentPrice;
    int minimumPrice;
    int maximumPrice;

    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimumPrice = currentPrice;
        this.maximumPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        if (newPrice > this.maximumPrice) {
            this.maximumPrice = newPrice;
        }
        else if (newPrice < this.minimumPrice) {
            this.minimumPrice = newPrice;
        }
        this.currentPrice = newPrice;
    }
    String getPriceInformation() {
        return "Company = \"" + this.companyName +"\", Current Price = " + this.currentPrice + ", Min Price = " + this.minimumPrice + ", Max Price = " + maximumPrice;
    }

    String getCompanyName() {
        return companyName;
    }

    int getCurrentPrice() {
        return currentPrice;
    }

    int getMinimumPrice() {
        return minimumPrice;
    }

    int getMaximumPrice() {
        return maximumPrice;
    }
}
