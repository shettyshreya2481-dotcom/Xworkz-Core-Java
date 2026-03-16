class Pc {

    String pcName;
    Hardware hardware;

    Pc(String pcName, Hardware hardware) {
        this.pcName = pcName;
        this.hardware = hardware;
    }

    void display() {
        System.out.println("PC Name: " + pcName);
        hardware.display();
        System.out.println("-------------------");
    }
}