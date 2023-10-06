package State;

public class ConcreteStateA implements IState{
    @Override
    public void operation(ContextState contextState) {
        System.out.println("ConcreteStateA");
    }
}
