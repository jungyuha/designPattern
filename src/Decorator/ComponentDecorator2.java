package Decorator;

public class ComponentDecorator2 extends Decorator{
    public ComponentDecorator2(IComponent com){
        super(com);
    }

    @Override
    public void operation() {
        super.operation();
        extraOperation();
    }

    @Override
    public void extraOperation() {
        System.out.println("ComponentDecorator2");
    }
}
