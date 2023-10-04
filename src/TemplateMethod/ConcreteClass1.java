package TemplateMethod;

public class ConcreteClass1 extends AbstractTemplate {
    @Override
    boolean hook() {
        return false;
    }

    @Override
    void step1() {
        System.out.println("ConcreteClass1_Step1");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClass1_Step2");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClass1_Step3");
    }

}
