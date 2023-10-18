package State;

public class ConcreteState1 implements IState{
    private ConcreteState1(){}
    private static class innerHolder{
        private static final ConcreteState1 INSTANCE = new ConcreteState1();
    }
    public static ConcreteState1 getInstance(){
        return innerHolder.INSTANCE;
    }
    @Override
    public void operation1(ContextState contextState) {
        System.out.println("state :: on  => on 때에 operation1");
    }

    @Override
    public void operation2(ContextState contextState) {
        System.out.println("state :: on  => on 때에 operation2");
        contextState.setState(ConcreteState2.getInstance());
    }
}
