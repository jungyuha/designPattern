import State.ConcreteStateA;
import State.ConcreteStateB;
import State.ContextState;
import TemplateMethod.AbstractTemplate;
import TemplateMethod.ConcreteClass1;
import TemplateMethod.ConcreteClass2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. 데코레이터 패턴(구조)
//        IComponent decorator = new ComponentDecorator2(new ComponentDecorator1(new ConcreteComponent()));
//        decorator.operation();

        // 2. 어댑터 패턴_합성(구조)
//        Adapater adapter_composition = new Adapater(new Adaptee());
//        adapter_composition.newOperation();

        // 3. 어댑터 패턴_상속(구조)
//        Adapter adapter_inheritance = new Adapter();
//        adapter_inheritance.newOperation();

        // 4. 프록시 패턴 일반(구조)
//        NormalProxy normalProxy = new NormalProxy(new RealSubject());
//        normalProxy.operation();

        // 5. 프록시 패턴 가상(구조)
//        VirtualProxy virtualProxy = new VirtualProxy();
//        virtualProxy.operation();

        // 6. 프록시 패턴 보호(구조)
//        ProtectionProxy protectionProxy = new ProtectionProxy(new RealSubject(),false);
//        protectionProxy.operation();

        // 7. 프록시 패턴 보호(로깅)
//        LoggingProxy loggingProxy = new LoggingProxy(new RealSubject());
//        loggingProxy.operation();

        // 8. 옵저버 패턴
//        ConcreteSubject concreteSubject = new ConcreteSubject();
//        IObserver observer1 = new ConcreteObserver1();
//        IObserver observer2 =  new ConcreteObserver2();
//        concreteSubject.registerObserver(observer1);
//        concreteSubject.registerObserver(observer2);
//        concreteSubject.notifyObserver();
//        concreteSubject.removeObserver(observer1);
//        concreteSubject.notifyObserver();

        // 9. 팩토리 메서드 패턴
//        AbstractFactoryMethod factory = null;
//        factory = new ConcreteFactory1();
//        IProduct concreteProduct1= factory.createOperation();
//        factory = new ConcreteFactory2();
//        IProduct concreteProduct2= factory.createOperation();

        // 10. 추상 팩토리 패턴
//        AbstractFactory factory = null;
//        factory = ConcreteFactory_Mac.getInstance();   // 공장군 mac (싱글톤!!)
//        AbstractProductA productA_mac = factory.createProductA();
//        AbstractProductB productB_mac = factory.createProductB();
//        factory = ConcreteFactory_Windows.getInstance();    // 공장군 windows (싱글톤!!)
//        AbstractProductA productA_windows = factory.createProductA();
//        AbstractProductB productB_windows = factory.createProductB();

        // 11. 전략 패턴
//        ContextStrategy strategyContext = new Context();
//        strategyContext.setStrategy(new ConcreteStrategyA());
//        strategyContext.operation();
//        strategyContext.setStrategy(new ConcreteStrategyB());
//        strategyContext.operation();

        // 12. 상태 패턴
//        ContextState contextState = new ContextState();
//        contextState.setState(ConcreteStateA.getInstance());
//        contextState.requestHandle();
//        contextState.setState(ConcreteStateB.getInstance());
//        contextState.requestHandle();

        // 13. 템플릿 메소드
        AbstractTemplate templateMethod = null;
        templateMethod = new ConcreteClass1();
        templateMethod.templateMethod();
        templateMethod = new ConcreteClass2();
        templateMethod.templateMethod();

    }
}