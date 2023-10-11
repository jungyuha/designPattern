package Proxy;

import Proxy.ISubject;

public class NormalProxy implements ISubject {
    private ISubject realSubject;
    public NormalProxy(ISubject subject){
        this.realSubject=subject;
    }
    @Override
    public void operation() {
        realSubject.operation();    // 위임받음
        System.out.println("프록시 위임 액션");
    }

}
