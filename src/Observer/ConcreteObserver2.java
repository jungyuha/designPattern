package Observer;

public class ConcreteObserver2 implements IObserver{
    @Override
    public void update() {
        System.out.println("ConcreteObserver2 알림 !");
    }
}
