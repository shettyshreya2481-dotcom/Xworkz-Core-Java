public class VVPuramRunner {

    public static void main(String[] args) {

        FoodStreet f1 = new FoodStreet("Masala Dosa",60);
        VVPuram v1 = new VVPuram("Bangalore", f1);

        FoodStreet f2 = new FoodStreet("Gobi Manchurian",80);
        VVPuram v2 = new VVPuram("Bangalore", f2);

        v1.display();
        v2.display();
    }
}