package Decorator;

public class ConcreteComponent implements IComponent{
    @Override
    public void operation() {
        System.out.println("Concrete Component");
    }
}
