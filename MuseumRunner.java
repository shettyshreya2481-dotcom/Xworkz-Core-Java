public class MuseumRunner {

    public static void main(String[] args) {

        Diamond d1 = new Diamond("White",5.2);
        Museum m1 = new Museum("National Museum", d1);

        Diamond d2 = new Diamond("Blue",3.8);
        Museum m2 = new Museum("City Museum", d2);

        m1.display();
        m2.display();
    }
}