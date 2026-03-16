class Player {

    String name;
    int jerseyNumber;

    Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    void display() {
        System.out.println(name + " " + jerseyNumber);
    }
}