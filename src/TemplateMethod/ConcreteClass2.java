package TemplateMethod;

public class ConcreteClass2 extends AbstractTemplate{
    @Override
    void step1() {
        System.out.println("ConcreteClass2_Step1");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClass2_Step2");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClass2_Step3");
    }
}
