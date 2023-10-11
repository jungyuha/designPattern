package Proxy;

public class VirtualProxy implements ISubject{
    RealSubject realSubject;
    public VirtualProxy(){}
    @Override
    public void operation() {
        if(realSubject==null){
            System.out.println("객체 생성");
            realSubject=new RealSubject();
        }
        realSubject.operation();
        System.out.println("가상 프록시 위임 액션");
    }
}
