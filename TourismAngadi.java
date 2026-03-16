class TourismAngadi {

    String agencyName;
    Package pack;

    TourismAngadi(String agencyName, Package pack) {
        this.agencyName = agencyName;
        this.pack = pack;
    }

    void display() {
        System.out.println("Agency: " + agencyName);
        pack.display();
    }
}