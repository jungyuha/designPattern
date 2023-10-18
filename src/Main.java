import State.ConcreteState1;
import State.ContextState;
import TemplateMethod2.AbstractTemplate;
import TemplateMethod2.ConcreteClass1;
import TemplateMethod2.ConcreteClass2;

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
//            AbstractFactoryMethod master = null;
//            AbstractFactoryMethod factory1 = new ConcreteFactoryMethod1();
//            AbstractFactoryMethod factory2 = new ConcreteFactoryMethod2();
//            master = factory1;
//            master.createOperate();
//            master = factory2;
//            master.createOperate();

        // 10. 추상 팩토리 패턴

//        IFactory iFactory = null;
//        IFactory iFactoryMac = ConcreteFactoryForMac.getInstance();
//        IFactory iFactoryWin = ConcreteFactoryForWin.getInstance();
//
//        iFactory = iFactoryMac; // 교체
//        iFactory.createKeyboard();  // 메소드명 같음 > 다형성
//        iFactory.createMouse();
//
//        iFactory = iFactoryWin;
//        iFactory.createKeyboard();
//        iFactory.createMouse();


        // 11. 전략 패턴
//        ContextStrategy contextStrategy = new ContextStrategy();
//        IStrategy iStrategy = new ConcreteStrategy1();
//        IStrategy iStrategy2 = new ConcreteStrategy2();
//        contextStrategy.setiStrategy(iStrategy);
//        contextStrategy.operation();
//        contextStrategy.setiStrategy(iStrategy2);
//        contextStrategy.operation();

        // 12. 상태 패턴
//        ContextState contextState=new ContextState();
//        contextState.setState(ConcreteState1.getInstance());
//        contextState.requestHandle();
//        //contextState.setState(ConcreteState2.getInstance());
//        contextState.requestHandle();

        // 13. 템플릿 메소드 패턴
        AbstractTemplate master =null;
        AbstractTemplate class1 = new ConcreteClass1();
        AbstractTemplate class2 = new ConcreteClass2();
        master = class1;
        master.templateMethod();
        master = class2;
        master.templateMethod();

        // 14. 빌더패턴(싱글 GOF)
//        Person_SingleGof instance1 = new Person_SingleGof
//                                    .BuilderSingleGof()
//                                    .name("test1")
//                                    .age(21).build();
    }
}