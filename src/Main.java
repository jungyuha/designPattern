import FactoryMethod.AbstractFactoryMethod;
import FactoryMethod.ConcreteFactoryMethod1;
import FactoryMethod.ConcreteFactoryMethod2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. 데코레이터 패턴(구조)
//        ComponenetDecorator1 iComponent = new ComponenetDecorator1(new FirstComponent());
//        iComponent.operation2();
//
//        ComponenetDecorator2 iComponent2 = new ComponenetDecorator2(iComponent);
//        iComponent2.operation2();

        // 2. 어댑터 패턴_합성(구조)
//        AdapterNew adapterNew = new AdapterNew(new AdapteeOld());
//        adapterNew.newOperation();

        // 3. 어댑터 패턴_상속(구조)
//        AdapterNew adapterNew = new AdapterNew();
//        adapterNew.newOperation();

        // 4. 프록시 패턴 일반(구조)
//        NormalProxy normalProxy = new NormalProxy(new RealSubject());
//        normalProxy.operation();

        // 5. 프록시 패턴 가상(구조)
//        VirtualProxy virtualProxy = new VirtualProxy();
//        virtualProxy.operation();
//        virtualProxy.operation();

        // 6. 프록시 패턴 보호(구조)
//        ProtectionProxy protectionProxy = new ProtectionProxy(new RealSubject(),false);
//        protectionProxy.operation();
//        ProtectionProxy protectionProxy = new ProtectionProxy(new RealSubject(),true);
//        protectionProxy.operation();

        // 7. 프록시 패턴 보호(로깅)
//            LoggingProxy loggingProxy = new LoggingProxy(new RealSubject());
//            loggingProxy.operation();

        // 8. 옵저버 패턴
//            ISubject iSubject = new ConcreteSubject();
//            IObserver iObserver1 = new ConcreteObserver1();
//            IObserver iObserver2 = new ConcreteObserver2();
//            iSubject.registerObserver(iObserver1);
//            iSubject.registerObserver(iObserver2);
//            iSubject.notifyObserver();
//            iSubject.deleteObserver(iObserver1);
//            iSubject.notifyObserver();
        // 9. 팩토리 메서드 패턴
            AbstractFactoryMethod master = null;
            AbstractFactoryMethod factory1 = new ConcreteFactoryMethod1();
            AbstractFactoryMethod factory2 = new ConcreteFactoryMethod2();
            master = factory1;
            master.createOperate();
            master = factory2;
            master.createOperate();

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

        // 13. 템플릿 메소드 패턴
//        AbstractTemplate templateMethod = null;
//        templateMethod = new ConcreteClass1();
//        templateMethod.templateMethod();
//        templateMethod = new ConcreteClass2();
//        templateMethod.templateMethod();

        // 14. 빌더패턴(싱글 GOF)
//        Person_SingleGof instance1 = new Person_SingleGof
//                                    .BuilderSingleGof()
//                                    .name("test1")
//                                    .age(21).build();
    }
}