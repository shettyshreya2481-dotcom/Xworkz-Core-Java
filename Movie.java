class Movie {

    String movieName;
    String hero;

    Movie(String movieName, String hero) {
        this.movieName = movieName;
        this.hero = hero;
    }

    void display() {
        System.out.println(movieName + " Hero: " + hero);
    }
}