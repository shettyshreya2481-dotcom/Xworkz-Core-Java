class Coffee {

    String coffeeType;
    int price;

    Coffee(String coffeeType, int price) {
        this.coffeeType = coffeeType;
        this.price = price;
    }

    void display() {
        System.out.println(coffeeType + " Price: " + price);
    }
}