package AbstractFactory;

public class ConcreteFactory_Windows implements AbstractFactory{
    private ConcreteFactory_Windows(){}
    private static class SingleInstanceHolder{
        private static final ConcreteFactory_Windows INSTANCE = new ConcreteFactory_Windows();
    }
    public static ConcreteFactory_Windows getInstance(){
        return SingleInstanceHolder.INSTANCE;   // 싱글톤화
    }
    @Override
    public AbstractProductA createProductA() {
        System.out.println("productA_windows 객체 생성");
        return new ConcreteProductA_Windows();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("productB_windows 객체 생성");
        return new ConcreteProductB_Windows();
    }
}

