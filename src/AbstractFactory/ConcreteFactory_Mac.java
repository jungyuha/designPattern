package AbstractFactory;

public class ConcreteFactory_Mac implements AbstractFactory{
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
