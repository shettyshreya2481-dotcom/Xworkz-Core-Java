class Stock {

    String stockName;
    double price;

    Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    void display() {
        System.out.println(stockName + " Price: " + price);
    }
}