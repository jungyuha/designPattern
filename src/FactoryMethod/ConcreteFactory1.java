package FactoryMethod;

public class ConcreteFactory1 extends AbstractFactoryMethod {
    @Override
    protected IProduct createProduct() {
        return new ConcreteProduct1();
    }
}
