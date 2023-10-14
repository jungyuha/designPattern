import Adapter_composition.Adapater;
import Adapter_composition.Adaptee;
import Decorator.ComponentDecorator1;
import Decorator.ComponentDecorator2;
import Decorator.ConcreteComponent;
import Decorator.IComponent;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. 데코레이터 패턴(구조)
//        IComponent decorator = new ComponentDecorator2(new ComponentDecorator1(new ConcreteComponent()));
//        decorator.operation();

        //2. 어댑터 패턴(구조)
        Adapater adapater = new Adapater(new Adaptee());
        adapater.newOperation();
    }
}