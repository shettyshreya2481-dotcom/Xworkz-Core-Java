public class CompanyRunner {

    public static void main(String[] args) {

        Project p1 = new Project("AI System",12);
        Company c1 = new Company("Infosys", p1);

        Project p2 = new Project("Web App",6);
        Company c2 = new Company("TCS", p2);

        c1.display();
        c2.display();
    }
}