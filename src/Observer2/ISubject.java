package Observer2;

public interface ISubject {
    void registerObserver(IObserver iObserver);
    void deleteObserver(IObserver iObserver);
    void notifyObserver();
}
