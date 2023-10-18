package Adapter_composition;

public class AdapterNew implements Target{
    AdapteeOld adapteeOld ;
    public AdapterNew(AdapteeOld adapteeOld){
        this.adapteeOld = adapteeOld;
    }

    @Override
    public void newOperation() {
        adapteeOld.oldOperation();
        System.out.println("adapter에서 새로운 기능 추가");
    }
}
