class NewsPaper {

    String paperName;
    Article article;

    NewsPaper(String paperName, Article article) {
        this.paperName = paperName;
        this.article = article;
    }

    void display() {
        System.out.println("NewsPaper: " + paperName);
        article.display();
        System.out.println("------------------");
    }
}