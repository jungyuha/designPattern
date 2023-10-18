package Strategy;

public class ContextStrategy {
    IStrategy iStrategy;

    public void setiStrategy(IStrategy iStrategy){
        this.iStrategy=iStrategy;
    }
    public void operation(){
        iStrategy.operation();
    }
}
