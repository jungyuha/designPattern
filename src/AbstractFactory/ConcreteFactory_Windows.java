package AbstractFactory;

public class ConcreteFactory_Windows implements AbstractFactory{
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

