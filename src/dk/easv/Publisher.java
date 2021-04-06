package dk.easv;

import java.util.Stack;

public class Publisher extends Subscribable<Newspaper> {
    private final Stack<Newspaper> papers = new Stack<>();

    public void release(Newspaper newspaper) {
        papers.push(newspaper);
        notifySubscribers(newspaper);
    }

    public Newspaper getLatestIssue() {
        return papers.peek();
    }
}
