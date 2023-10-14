package Adapter_inheritance;

public class Adapter extends Adaptee implements Target{
    @Override
    public void newOperation() {
        oldOperation();
    }
}
