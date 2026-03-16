public class CCdRunner {

    public static void main(String[] args) {

        Coffee c1 = new Coffee("Cappuccino",120);
        CCd ccd1 = new CCd("Cafe Coffee Day", c1);

        Coffee c2 = new Coffee("Latte",140);
        CCd ccd2 = new CCd("Cafe Coffee Day", c2);

        ccd1.display();
        ccd2.display();
    }
}