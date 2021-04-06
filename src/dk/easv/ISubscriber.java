package dk.easv;

public interface ISubscriber<TUpdateType> {
    void update(Subscribable publisher, TUpdateType newspaper);
}
