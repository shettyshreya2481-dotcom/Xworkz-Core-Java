class Hardware {

    String type;
    String brand;

    Hardware(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    void display() {
        System.out.println("Hardware Type: " + type);
        System.out.println("Brand: " + brand);
    }
}