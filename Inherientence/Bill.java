class Bill extends Patient {
    int costPerDay = 2000;

    Bill(String name, int days) {
        super(name, days);
    }

    void calculateBill() {
        int total = days * costPerDay;
        System.out.println("Total Bill: " + total);
    }
}