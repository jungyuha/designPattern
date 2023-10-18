package Builder;

public class SingleObj {
    String test1 ;
    int test2;

    private SingleObj(String test1 , int test2){
        this.test1=test1;
        this.test2=test2;
    }
    public static class Builder{
        String test1;
        int test2;

        public Builder test1(String test1){
            this.test1=test1;
            return this;
        }
        public Builder test2(int test2){
            this.test2 = test2;
            return this;
        }
        public SingleObj builder(){
            return new SingleObj(test1,test2);
        }
    }
    public String toString(){
        return "test1 :"+test1+",test2 :"+test2;
    }
}
