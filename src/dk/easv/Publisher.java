package dk.easv;

import java.util.Stack;

public class Publisher {
    private final Stack<Newspaper> papers = new Stack<>();

    public void release(Newspaper newspaper) {
        papers.push(newspaper);
    }

    public Newspaper getLatestIssue() {
        return papers.peek();
    }
}
