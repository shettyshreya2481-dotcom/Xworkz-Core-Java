class Tv {

    String brand;
    Channel channel;

    Tv(String brand, Channel channel) {
        this.brand = brand;
        this.channel = channel;
    }

    void display() {
        System.out.println("TV Brand: " + brand);
        channel.display();
    }
}