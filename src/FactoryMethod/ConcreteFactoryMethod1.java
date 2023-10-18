package FactoryMethod;

public class ConcreteFactoryMethod1 extends AbstractFactoryMethod{
    @Override
    IProduct createConcreteProduct() {
        IProduct iProduct = new ConcreteProduct1();
        iProduct.setting();
        return iProduct;
    }
}
