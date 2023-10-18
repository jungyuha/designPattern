package FactoryMethod;

public class ConcreteFactoryMethod2 extends AbstractFactoryMethod{
    @Override
    IProduct createConcreteProduct() {
        IProduct iProduct = new ConcreteProduct2();
        iProduct.setting();
        return iProduct;
    }
}
