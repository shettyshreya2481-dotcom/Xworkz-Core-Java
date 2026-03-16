public class PeriodicTableRunner {

    public static void main(String[] args) {

        Element e1 = new Element("Hydrogen","H");
        PeriodicTable p1 = new PeriodicTable(1, e1);

        Element e2 = new Element("Oxygen","O");
        PeriodicTable p2 = new PeriodicTable(16, e2);

        p1.display();
        p2.display();
    }
}