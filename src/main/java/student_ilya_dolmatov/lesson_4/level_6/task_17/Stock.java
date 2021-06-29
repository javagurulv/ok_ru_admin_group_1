package student_ilya_dolmatov.lesson_4.level_6.task_17;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int stockPrice){
        this.companyName = companyName;
        this.currentPrice = stockPrice;
        this.minPrice = stockPrice;
        this.maxPrice = stockPrice;
    }
    String getPriceInformation(){
        return "Company " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
    void updatePrice(int newPrice){
        if(newPrice > maxPrice){
            maxPrice = newPrice;
            currentPrice = newPrice;
        } else if(newPrice < maxPrice && newPrice < minPrice){
            minPrice = newPrice;
            currentPrice = newPrice;
        } else currentPrice = newPrice;
    }


}
