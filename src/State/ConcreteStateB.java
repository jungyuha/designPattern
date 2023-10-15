package State;

public class ConcreteStateB implements IState{
    private ConcreteStateB(){}
    private static class SingleInstanceHolder{
        private static final ConcreteStateB INSTANCE = new ConcreteStateB();
    }
    public static ConcreteStateB getInstance(){
        return SingleInstanceHolder.INSTANCE;
    }
    @Override
    public void operation(ContextState contextState) {
        System.out.println("ConcreteStateB");
        contextState.setState(ConcreteStateA.getInstance()); // 특정 상태에서 다른 상태를 불러올 수도 있음
    }
}
