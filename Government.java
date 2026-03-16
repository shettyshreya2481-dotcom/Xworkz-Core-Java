class Government {

    String country;
    Policy policy;

    Government(String country, Policy policy) {
        this.country = country;
        this.policy = policy;
    }

    void display() {
        System.out.println("Country: " + country);
        policy.display();
    }
}