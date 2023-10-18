package Adapter_inheritance;

public class AdapterNew extends AdapteeOld implements Target{

    @Override
    public void newOperation() {
        oldOperation();
        System.out.println("newOperation");
    }
}
