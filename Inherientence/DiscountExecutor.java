public class Main {
    public static void main(String[] args) {
        DiscountProduct p = new DiscountProduct("Laptop", 60000, 10);

        p.displayProduct();      // parent method
        p.calculateDiscount();  // child method
    }
}