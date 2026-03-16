public class IplRunner {

    public static void main(String[] args) {

        Player p1 = new Player("Virat",18);
        Ipl i1 = new Ipl("RCB", p1);

        Player p2 = new Player("Dhoni",7);
        Ipl i2 = new Ipl("CSK", p2);

        i1.display();
        i2.display();
    }
}