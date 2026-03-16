class CCd {

    String cafeName;
    Coffee coffee;

    CCd(String cafeName, Coffee coffee) {
        this.cafeName = cafeName;
        this.coffee = coffee;
    }

    void display() {
        System.out.println("Cafe: " + cafeName);
        coffee.display();
    }
}