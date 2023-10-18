package Decorator2;

public abstract class Decorator implements IComponent{
    IComponent firstComponent;
    public Decorator(IComponent com){
        this.firstComponent = com;
    }
    @Override
    public void operation2() {
        firstComponent.operation2();
    }
}
