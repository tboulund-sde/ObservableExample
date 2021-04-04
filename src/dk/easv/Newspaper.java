package dk.easv;

public class Newspaper {

    private Article[] articles;

    public Newspaper(Article... articles) {
        this.articles = articles;
    }

    public Article[] getArticles() {
        return articles;
    }

}
