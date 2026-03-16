class VVPuram {

    String location;
    FoodStreet food;

    VVPuram(String location, FoodStreet food) {
        this.location = location;
        this.food = food;
    }

    void display() {
        System.out.println("Location: " + location);
        food.display();
    }
}