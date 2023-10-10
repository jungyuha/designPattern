package Proxy;

public class LoggingProxy implements ISubject{
    RealSubject realSubject;
    public LoggingProxy(RealSubject realSubject){
        this.realSubject=realSubject;
    }
    @Override
    public void operation() {
        System.out.println("before 로깅");
        realSubject.operation();
        System.out.println("after 로깅");
    }
}
