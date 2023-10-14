package Decorator;

public abstract class Decorator implements IComponent{
    IComponent com;
    public Decorator(IComponent component){
        this.com=component;
    }
    @Override
    public void operation() {
        com.operation();
    }
    public abstract void extraOperation();
}
