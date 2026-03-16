public class GovernmentRunner {

    public static void main(String[] args) {

        Policy p1 = new Policy("Education Policy",2020);
        Government g1 = new Government("India", p1);

        Policy p2 = new Policy("Health Policy",2021);
        Government g2 = new Government("India", p2);

        g1.display();
        g2.display();
    }
}