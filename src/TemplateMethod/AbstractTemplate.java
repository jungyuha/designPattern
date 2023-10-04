package TemplateMethod;

public abstract class AbstractTemplate {
    public final void templateMethod(){
        step1();
        if(hook()){
            step2();
        }
        step3();
    }

    boolean hook(){
        return true;
    }

    abstract void step1();
    abstract void step2();
    abstract void step3();
}
