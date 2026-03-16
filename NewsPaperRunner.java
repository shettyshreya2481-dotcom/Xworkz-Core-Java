public class NewsPaperRunner {

    public static void main(String[] args) {

        Article a1 = new Article("Election Results","Ravi");
        NewsPaper n1 = new NewsPaper("The Hindu", a1);

        Article a2 = new Article("Sports News","Kiran");
        NewsPaper n2 = new NewsPaper("Times Of India", a2);

        n1.display();
        n2.display();
    }
}