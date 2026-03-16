class Element {

    String name;
    String symbol;

    Element(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    void display() {
        System.out.println(name + " " + symbol);
    }
}