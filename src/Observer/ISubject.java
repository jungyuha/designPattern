package Observer;

public interface ISubject {
    void registerObserver(IObserver iObserver);
    void deleteObserver(IObserver iObserver);
    void notifyObserver();
}
