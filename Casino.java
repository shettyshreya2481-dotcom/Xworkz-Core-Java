class Cassino {

    String game;
    int tableNumber;

    Cassino(String game, int tableNumber) {
        this.game = game;
        this.tableNumber = tableNumber;
    }

    void display() {
        System.out.println("Game: " + game);
        System.out.println("Table: " + tableNumber);
    }
}