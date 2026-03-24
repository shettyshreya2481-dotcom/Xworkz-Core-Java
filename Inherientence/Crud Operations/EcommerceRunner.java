class EcommerceRunner {
    public static void main(String[] args) {

        Ecommerce ec = new Ecommerce();

        ec.addProduct("Laptop");
        ec.addProduct("Smartphone");
        ec.addProduct("Headphones");
        ec.addProduct("Smart Watch");
        ec.addProduct("Bluetooth Speaker");
        ec.addProduct("Tablet");
        ec.addProduct("Camera");
        ec.addProduct("Power Bank");
        ec.addProduct("Keyboard");
        ec.addProduct("Mouse");
        ec.addProduct("Monitor");
        ec.addProduct("Printer");
        ec.addProduct("Gaming Console");
        ec.addProduct("Router");
        ec.addProduct("External Hard Drive");
        ec.addProduct("USB Flash Drive");
        ec.addProduct("Air Conditioner");
        ec.addProduct("Refrigerator");
        ec.addProduct("Washing Machine");
        ec.addProduct("Microwave Oven");

        ec.displayProducts();
    }
}