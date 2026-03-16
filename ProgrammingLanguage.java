class ProgrammingLanguage {

    String languageName;
    Syntax syntax;

    ProgrammingLanguage(String languageName, Syntax syntax) {
        this.languageName = languageName;
        this.syntax = syntax;
    }

    void display() {
        System.out.println("Language: " + languageName);
        syntax.display();
    }
}