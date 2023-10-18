package State;

public class ContextState {
    IState iState;  // 상태는 싱글톤이다.
    public void setState(IState iState){
        System.out.println("상태 set :: "+iState);
        this.iState = iState;
    }
    public void requestHandle(){
        iState.operation1(this);
        iState.operation2(this);
    }
}
