package AbstractFactory;

public class ConcreteFactory_Mac implements AbstractFactory{
    private ConcreteFactory_Mac(){}
    private static class SingleInstanceHolder {
        private static final ConcreteFactory_Mac INSTANCE = new ConcreteFactory_Mac();
    }
    public static ConcreteFactory_Mac getInstance(){
        return SingleInstanceHolder.INSTANCE;   // 싱글톤화 처리
    }
    @Override
    public AbstractProductA createProductA() {
        System.out.println("productA_mac 객체 생성");
        return new ConcreteProductA_Mac();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("productB_mac 객체 생성");
        return new ConcreteProductB_Mac();
    }
}
