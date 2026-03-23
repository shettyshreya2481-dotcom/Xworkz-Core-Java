class Product {
    String productName;
    double price;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}