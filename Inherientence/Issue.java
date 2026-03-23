public class Main {
    public static void main(String[] args) {
        IssuedBook book = new IssuedBook("Java Basics", "James", 10);

        book.displayBook();     // parent method
        book.calculateFine();   // child method
    }
}