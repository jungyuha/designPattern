package Strategy;

public class Context {  // 컨텍스트의 역할 : 전략 알고리즘을 1.설정 2.실행
    IStrategy strategy; // 전략 인터페이스를 합성

    public void setStrategy(IStrategy strategy){
        this.strategy=strategy;
    }
    public void operation (){
        this.strategy.operation();
    }
}
