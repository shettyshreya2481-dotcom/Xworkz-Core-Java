class Ipl {

    String teamName;
    Player player;

    Ipl(String teamName, Player player) {
        this.teamName = teamName;
        this.player = player;
    }

    void display() {
        System.out.println("Team: " + teamName);
        player.display();
    }
}