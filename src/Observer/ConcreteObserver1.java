package Observer;

public class ConcreteObserver1 implements IObserver{
    @Override
    public void update() {
        System.out.println("ConcreteObserver1 알림 !");
    }
}
