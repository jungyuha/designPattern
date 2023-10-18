package Decorator2;

public class ComponenetDecorator1 extends Decorator {
    public ComponenetDecorator1(IComponent com) {
        super(com);
    }

    @Override
    public void operation2() {
        super.operation2();
        this.extraOperation1();
    }

    public void extraOperation1(){
        System.out.println("ComponenetDecorator1만의 기능");
    }
}
