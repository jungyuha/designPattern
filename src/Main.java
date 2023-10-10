import Proxy.LoggingProxy;
import Proxy.ProtectionProxy;
import Proxy.RealSubject;
import Proxy.VirtualProxy;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. 데코레이터 패턴(구조)
//        IComponent decorator = new ComponentDecorator2(new ComponentDecorator1(new ConcreteComponent()));
//        decorator.operation();

        //2. 어댑터 패턴_합성(구조)
//        Adapater adapter_composition = new Adapater(new Adaptee());
//        adapter_composition.newOperation();

        //3. 어댑터 패턴_상속(구조)
//        Adapter adapter_inheritance = new Adapter();
//        adapter_inheritance.newOperation();

        //4. 프록시 패턴 일반(구조)
//        NormalProxy normalProxy = new NormalProxy(new RealSubject());
//        normalProxy.operation();

        //5. 프록시 패턴 가상(구조)
//        VirtualProxy virtualProxy = new VirtualProxy();
//        virtualProxy.operation();

        //6. 프록시 패턴 보호(구조)
//        ProtectionProxy protectionProxy = new ProtectionProxy(new RealSubject(),false);
//        protectionProxy.operation();

        //7. 프록시 패턴 보호(로깅)
        LoggingProxy loggingProxy = new LoggingProxy(new RealSubject());
        loggingProxy.operation();
    }
}