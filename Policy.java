class Policy {

    String policyName;
    int year;

    Policy(String policyName, int year) {
        this.policyName = policyName;
        this.year = year;
    }

    void display() {
        System.out.println(policyName + " Year: " + year);
    }
}