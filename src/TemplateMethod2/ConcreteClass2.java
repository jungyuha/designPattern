package TemplateMethod2;

public class ConcreteClass2 extends AbstractTemplate{
    @Override
    boolean hook() {
        System.out.println("ConcreteClass2 :: false");
        return false;
    }

    @Override
    void step1() {
        System.out.println("ConcreteClass2 :: step1");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClass2 :: step2");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClass2 :: step3");
    }
}
