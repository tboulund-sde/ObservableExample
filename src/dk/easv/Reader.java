package dk.easv;

import java.util.Random;

public abstract class Reader {

    private String name;
    private Publisher publisher;
    private Newspaper myIssue;

    public Reader(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    public void read() {
        Newspaper latest = publisher.getLatestIssue();
        if(latest == null || latest.equals(myIssue)) {
            System.out.println("\033[1;31m" + "Reader named " + name + " is sad because he already read the latest news." + "\033[0m");
            return;
        }

        myIssue = latest;
        Article[] articles = myIssue.getArticles();
        Random random = new Random();

        Article article = articles[random.nextInt(articles.length)];
        System.out.println("\033[1;34m" + "Reader named " + name + " is reading article with title '" + article.getTitle() + "'." + "\033[0m");
    }
}
