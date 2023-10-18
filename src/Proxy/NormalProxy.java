package Proxy;

public class NormalProxy implements ISubject{
    ISubject iSubject;
    public NormalProxy(ISubject iSubject){
        this.iSubject=iSubject;
    }
    @Override
    public void operation() {
        System.out.println("before origin in NormalProxy");
        iSubject.operation();
        System.out.println("after origin in NormalProxy");
    }
}
