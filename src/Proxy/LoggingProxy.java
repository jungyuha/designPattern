package Proxy;

public class LoggingProxy implements ISubject{
    ISubject iSubject;
    public LoggingProxy(ISubject iSubject){
        this.iSubject = iSubject;
    }
    @Override
    public void operation() {
        System.out.println("before Logging Proxy");
        iSubject.operation();
        System.out.println("after Logging Proxy");
    }
}
