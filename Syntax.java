class Syntax {

    String keyword;
    String example;

    Syntax(String keyword, String example) {
        this.keyword = keyword;
        this.example = example;
    }

    void display() {
        System.out.println("Keyword: " + keyword);
        System.out.println("Example: " + example);
    }
}