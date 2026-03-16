class Groww {

    String appName;
    Stock stock;

    Groww(String appName, Stock stock) {
        this.appName = appName;
        this.stock = stock;
    }

    void display() {
        System.out.println("App: " + appName);
        stock.display();
    }
}