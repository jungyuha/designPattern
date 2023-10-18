package Builder;

public class TestBuilder {
    String test1;
    int test2;

    public TestBuilder test1(String test1){
        this.test1=test1;
        return this;
    }
    public TestBuilder test2(int test2){
        this.test2=test2;
        return this;
    }
    public TestObj builder(){
        return new TestObj(test1,test2);
    }
}
