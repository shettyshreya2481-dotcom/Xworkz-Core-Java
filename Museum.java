class Museum {

    String museumName;
    Diamond diamond;

    Museum(String museumName, Diamond diamond) {
        this.museumName = museumName;
        this.diamond = diamond;
    }

    void display() {
        System.out.println("Museum: " + museumName);
        diamond.display();
    }
}