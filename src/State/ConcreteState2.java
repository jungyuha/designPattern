package State;

public class ConcreteState2 implements IState{
    private ConcreteState2(){}
    private static class innerHolder{
        private static final ConcreteState2 INSTANCE = new ConcreteState2();
    }
    public static ConcreteState2 getInstance(){
        return innerHolder.INSTANCE;
    }
    @Override
    public void operation1(ContextState contextState) {
        System.out.println("state :: off => off일 때에 operation1");
    }

    @Override
    public void operation2(ContextState contextState) {
        System.out.println("state :: off => off일 때에 operation2");
        contextState.setState(ConcreteState1.getInstance());
    }
}
