package FactoryMethod;

public abstract class AbstractFactoryMethod {

    public final IProduct createOperation(){
        IProduct product = createProduct();
        product.setting();

        return product;
    }
    abstract protected IProduct createProduct() ;
}
