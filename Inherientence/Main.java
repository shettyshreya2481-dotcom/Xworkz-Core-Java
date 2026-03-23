public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Shreya", 50000, 10000);

        dev.displayDetails();   // parent method
        dev.calculateSalary();  // child method
    }
}