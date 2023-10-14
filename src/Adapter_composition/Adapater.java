package Adapter_composition;

public class Adapater implements Target{
    Adaptee adaptee;
    public Adapater(Adaptee origin){
        this.adaptee=origin;
    }
    @Override
    public void newOperation() {
        adaptee.oldOperation();
    }
}
