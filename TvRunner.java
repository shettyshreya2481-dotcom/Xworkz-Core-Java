public class TvRunner {

    public static void main(String[] args) {

        Channel c1 = new Channel("Star Sports","English");
        Tv t1 = new Tv("Samsung", c1);

        Channel c2 = new Channel("Zee Kannada","Kannada");
        Tv t2 = new Tv("LG", c2);

        t1.display();
        t2.display();
    }
}