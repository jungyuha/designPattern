package FactoryMethod;

public abstract class AbstractFactoryMethod {
    public final void createOperate(){
        System.out.println("생성 전처리");
        createConcreteProduct();
        System.out.println("생성 후처리");
    }
    abstract IProduct createConcreteProduct();
}
