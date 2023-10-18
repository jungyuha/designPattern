package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject{
    List<IObserver> observerList = new ArrayList<>();
    @Override
    public void registerObserver(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void deleteObserver(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public void notifyObserver() {
        for(IObserver io : observerList){
            io.update();
        }
    }
}
