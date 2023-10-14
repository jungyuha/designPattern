package Observer;

public interface ISubject {
    void registerObserver(IObserver iObserver);
    void removeObserver(IObserver iObserver);
    void notifyObserver();
}
