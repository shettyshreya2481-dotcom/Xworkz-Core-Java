class IssuedBook extends Book {
    int daysIssued;
    double finePerDay = 5;

    // Constructor
    IssuedBook(String title, String author, int daysIssued) {
        super(title, author); // call parent constructor
        this.daysIssued = daysIssued;
    }

    void calculateFine() {
        int extraDays = daysIssued - 7; // 7 days free
        if (extraDays > 0) {
            double fine = extraDays * finePerDay;
            System.out.println("Fine: " + fine);
        } else {
            System.out.println("No Fine");
        }
    }
}