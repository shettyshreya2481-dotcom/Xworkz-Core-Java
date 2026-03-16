public class TourismAngadiRunner {

    public static void main(String[] args) {

        Package p1 = new Package("Goa",3);
        TourismAngadi t1 = new TourismAngadi("Tourism Angadi", p1);

        Package p2 = new Package("Kerala",5);
        TourismAngadi t2 = new TourismAngadi("Tourism Angadi", p2);

        t1.display();
        t2.display();
    }
}