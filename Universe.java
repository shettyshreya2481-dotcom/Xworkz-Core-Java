class Universe {

    String galaxyName;
    Earth earth;

    Universe(String galaxyName, Earth earth) {
        this.galaxyName = galaxyName;
        this.earth = earth;
    }

    void display() {
        System.out.println("Galaxy: " + galaxyName);
        earth.display();
        System.out.println("------------------");
    }
}