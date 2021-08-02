package student_ivan_buymov.lesson_4.level_6.task_17;

class Stock {

    private String ticker;
    private Float currentPrice;
    private Float minPrice;
    private Float maxPrice;

    Stock(String ticker, float currentPrice) {
        this.ticker = ticker;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String toString(){
        String text = String.format("Company = %s, cur price: %f, min price: %f, max price: %f",
                this.ticker, this.currentPrice, this.minPrice, this.maxPrice);
        return text;
    }

    public void updatePrice(float newPrice){
        this.currentPrice = newPrice;
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
    }

    public void printPriceInformation(){
        System.out.println(this.toString());
    }


    public Float getCurrentPrice() {
        return currentPrice;
    }

    public Float getMinPrice() {
        return minPrice;
    }

    public Float getMaxPrice() {
        return maxPrice;
    }
}

