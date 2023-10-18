package Observer2;

public class ConcreteObserver1 implements IObserver {
    @Override
    public void update() {
        System.out.println("ConcreteObserver1");
    }
}
