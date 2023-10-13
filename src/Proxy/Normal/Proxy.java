package Proxy.Normal;

public class Proxy implements ISubject{
    private ISubject realSubject;
    public Proxy(ISubject subject){
        this.realSubject=subject;
    }
    @Override
    public void operation() {
        realSubject.operation();    // 위임받음
        System.out.println("프록시 추가 액션");
    }

}
