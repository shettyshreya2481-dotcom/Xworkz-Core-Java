class Frame {

    String type;
    String color;

    Frame(String type, String color) {
        this.type = type;
        this.color = color;
    }

    void display() {
        System.out.println("Frame Type: " + type);
        System.out.println("Color: " + color);
    }
}