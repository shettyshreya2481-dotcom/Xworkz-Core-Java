class Diamond {

    String color;
    double weight;

    Diamond(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}