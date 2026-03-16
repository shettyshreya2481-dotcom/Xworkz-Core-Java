public class ProgrammingLanguageRunner {

    public static void main(String[] args) {

        Syntax s1 = new Syntax("if","if(condition)");
        ProgrammingLanguage p1 = new ProgrammingLanguage("Java", s1);

        Syntax s2 = new Syntax("for","for(i=0;i<5;i++)");
        ProgrammingLanguage p2 = new ProgrammingLanguage("Java", s2);

        p1.display();
        p2.display();
    }
}