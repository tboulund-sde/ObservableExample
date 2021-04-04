package dk.easv;

import java.util.Observable;
import java.util.Stack;

public class Publisher extends Observable {
    private final Stack<Newspaper> papers = new Stack<>();

    public void release(Newspaper newspaper) {
        papers.push(newspaper);
        setChanged();
        notifyObservers(newspaper);
    }

    public Newspaper getLatestIssue() {
        return papers.peek();
    }



}
