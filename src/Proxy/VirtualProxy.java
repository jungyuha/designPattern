package Proxy;

public class VirtualProxy implements ISubject{
    ISubject iSubject ;
    @Override
    public void operation() {
        if(iSubject==null){
            iSubject = new RealSubject();
        }
        else{
            System.out.println("before Virtual Proxy");
            iSubject.operation();
            System.out.println("after Virtual Proxy");
        }
    }
}
