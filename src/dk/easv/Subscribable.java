package dk.easv;

import java.util.HashSet;

public abstract class Subscribable<TUpdateType> {
    private HashSet<ISubscriber<TUpdateType>> subscribers = new HashSet<>();

    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    protected void notifySubscribers(TUpdateType update) {
        for(ISubscriber subscriber : subscribers) {
            subscriber.update(this, update);
        }
    }

}
