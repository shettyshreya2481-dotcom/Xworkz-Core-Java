class BigDaddy {

    String clubName;
    Cassino cassino;

    BigDaddy(String clubName, Cassino cassino) {
        this.clubName = clubName;
        this.cassino = cassino;
    }

    void display() {
        System.out.println("Club: " + clubName);
        cassino.display();
        System.out.println("-------------------");
    }
}