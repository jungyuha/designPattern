package State;

public class ContextState {
    IState state;

    public void setState(IState state){
        this.state=state;
    }
    public void requestHandle(){
        state.operation(this);
    }

}
