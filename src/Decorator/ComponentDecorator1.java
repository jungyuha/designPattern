package Decorator;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class ComponentDecorator1 extends Decorator{
    public ComponentDecorator1(IComponent component){
        super(component);
    }
    @Override
    public void operation(){
        super.operation();
        extraOperation();
    }

    @Override
    public void extraOperation() {
        System.out.println("ComponentDecorator1");
    }
}
