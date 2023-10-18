package Proxy;

public class RealSubject implements ISubject{
    @Override
    public void operation() {
        System.out.println("realSubject");
    }
}
