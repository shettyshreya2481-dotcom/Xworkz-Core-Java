class Developer extends Employee {
    double bonus;

    // Constructor
    Developer(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // calling parent constructor
        this.bonus = bonus;
    }

    void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}