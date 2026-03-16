class Earth {

    String continent;
    long population;

    Earth(String continent, long population) {
        this.continent = continent;
        this.population = population;
    }

    void display() {
        System.out.println("Continent: " + continent);
        System.out.println("Population: " + population);
    }
}