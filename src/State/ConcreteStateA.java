package State;

public class ConcreteStateA implements IState{
    private ConcreteStateA(){}
    private static class SingleInstanceHolder{
        private static final ConcreteStateA INSTANCE = new ConcreteStateA();
    }
    public static ConcreteStateA getInstance(){
        return SingleInstanceHolder.INSTANCE;
    }
    @Override
    public void operation(ContextState contextState) {
        System.out.println("ConcreteStateA");
    }
}
