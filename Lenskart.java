class LensKart {

    String storeName;
    Frame frame;

    LensKart(String storeName, Frame frame) {
        this.storeName = storeName;
        this.frame = frame;
    }

    void display() {
        System.out.println("Store: " + storeName);
        frame.display();
        System.out.println("-----------------");
    }
}