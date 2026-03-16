public class ProductionHouseRunner {

    public static void main(String[] args) {

        Movie m1 = new Movie("KGF","Yash");
        ProductionHouse p1 = new ProductionHouse("Hombale Films", m1);

        Movie m2 = new Movie("RRR","RamCharan");
        ProductionHouse p2 = new ProductionHouse("DVV Entertainment", m2);

        p1.display();
        p2.display();
    }
}
