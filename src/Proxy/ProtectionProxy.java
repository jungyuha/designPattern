package Proxy;

public class ProtectionProxy implements ISubject{
    boolean authorizeYn;
    ISubject iSubject;
    public ProtectionProxy(ISubject iSubject,boolean authorizeYn){
        this.authorizeYn=authorizeYn;
        this.iSubject = iSubject;
    }
    @Override
    public void operation() {
        if(authorizeYn){
            System.out.println("before protection Proxy");
            iSubject.operation();
            System.out.println("after protection Proxy");
        }
        else{
            System.out.println("not authorized");
        }
    }
}
