package Builder;

public class Person_SingleGof {

    String name;
    int age;

    public static class BuilderSingleGof {
        String name;
        int age;
        public BuilderSingleGof name(String name){
            this.name = name;
            return this;
        }
        public BuilderSingleGof age(int age){
            this.age=age;
            return this;
        }
        public Person_SingleGof build(){
            return new Person_SingleGof(this);
        }
    }
    private Person_SingleGof(BuilderSingleGof builder){
        this.name = builder.name;
        this.age = builder.age;
    }
    @Override
    public String toString() {
        return "name : "+name+", age : "+age;
    }
}
