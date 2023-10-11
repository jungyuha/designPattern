package Proxy;

public class ProtectionProxy implements ISubject{
    RealSubject realSubject;
    boolean access;
    public ProtectionProxy(RealSubject realSubject,boolean access){
        this.realSubject=realSubject;
        this.access=access;
    }
    @Override
    public void operation() {
        if(access){
            realSubject.operation();
            System.out.println("보호 프록시 위임 액션");
        }
    }
}
