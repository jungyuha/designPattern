package FactoryMethod;

public class ConcreteFactory2 extends AbstractFactoryMethod {
    @Override
    protected IProduct createProduct() {
        return new ConcreteProduct2();
    }
}
