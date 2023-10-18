package Decorator2;

public class ComponenetDecorator2 extends Decorator{
    public ComponenetDecorator2(IComponent com) {
        super(com);
    }

    @Override
    public void operation2() {
        super.operation2();
        this.extraOperation2();
    }
    public void extraOperation2(){
        System.out.println("ComponenetDecorator2만의 기능");
    }
}
