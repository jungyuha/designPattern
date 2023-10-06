package State;

public class ConcreteStateB implements IState{
    @Override
    public void operation(ContextState contextState) {
        System.out.println("ConcreteStateB");
        contextState.setState(new ConcreteStateA()); // 특정 상태에서 다른 상태를 불러올 수도 있음
    }
}
