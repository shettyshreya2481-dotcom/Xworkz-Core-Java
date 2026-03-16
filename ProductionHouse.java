class ProductionHouse {

    String companyName;
    Movie movie;

    ProductionHouse(String companyName, Movie movie) {
        this.companyName = companyName;
        this.movie = movie;
    }

    void display() {
        System.out.println("Production House: " + companyName);
        movie.display();
    }
}