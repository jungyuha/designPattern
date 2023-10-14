package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject{
    List<IObserver> observers = new ArrayList<>();
    @Override
    public void registerObserver(IObserver iObserver) {
        observers.add(iObserver);
        System.out.println("등록 : "+iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        observers.remove(iObserver);
        System.out.println("삭제 : "+iObserver);
    }

    @Override
    public void notifyObserver() {
        for(IObserver o : observers){
            o.update(); // 위임
        }
    }
}
