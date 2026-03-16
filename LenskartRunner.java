public class LensKartRunner {

    public static void main(String[] args) {

        Frame f1 = new Frame("Round","Black");
        LensKart l1 = new LensKart("LensKart Bangalore", f1);

        Frame f2 = new Frame("Square","Gold");
        LensKart l2 = new LensKart("LensKart Mangalore", f2);

        l1.display();
        l2.display();
    }
}