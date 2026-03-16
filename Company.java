class Company {

    String companyName;
    Project project;

    Company(String companyName, Project project) {
        this.companyName = companyName;
        this.project = project;
    }

    void display() {
        System.out.println("Company: " + companyName);
        project.display();
    }
}