class FoodStreet {

    String foodName;
    int price;

    FoodStreet(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
    }

    void display() {
        System.out.println("Food: " + foodName);
        System.out.println("Price: " + price);
    }
}