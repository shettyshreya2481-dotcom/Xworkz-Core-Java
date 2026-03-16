class Package {

    String place;
    int days;

    Package(String place, int days) {
        this.place = place;
        this.days = days;
    }

    void display() {
        System.out.println("Place: " + place);
        System.out.println("Days: " + days);
    }
}