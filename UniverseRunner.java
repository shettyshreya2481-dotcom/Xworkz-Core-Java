public class UniverseRunner {

    public static void main(String[] args) {

        Earth e1 = new Earth("Asia",4600000000L);
        Universe u1 = new Universe("MilkyWay", e1);

        Earth e2 = new Earth("Europe",750000000L);
        Universe u2 = new Universe("MilkyWay", e2);

        u1.display();
        u2.display();
    }
}