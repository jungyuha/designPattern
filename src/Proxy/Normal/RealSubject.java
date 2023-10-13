package Proxy.Normal;

public class RealSubject implements ISubject{
    @Override
    public void operation() {
        System.out.println("원본객체 메서드");
    }
}
