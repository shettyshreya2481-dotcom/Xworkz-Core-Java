class DiscountProduct extends Product {
    double discountPercent;

    // Constructor
    DiscountProduct(String productName, double price, double discountPercent) {
        super(productName, price); // parent variables
        this.discountPercent = discountPercent;
    }

    void calculateDiscount() {
        double discountAmount = price * discountPercent / 100;
        double finalPrice = price - discountAmount;

        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Final Price: " + finalPrice);
    }
}