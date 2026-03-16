public class GrowwRunner {

    public static void main(String[] args) {

        Stock s1 = new Stock("TCS",3500);
        Groww g1 = new Groww("GrowwApp", s1);

        Stock s2 = new Stock("Infosys",1450);
        Groww g2 = new Groww("GrowwApp", s2);

        g1.display();
        g2.display();
    }
}