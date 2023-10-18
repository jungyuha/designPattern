package AbstractFactory;

public class ConcreteFactoryForMac implements IFactory{

    private ConcreteFactoryForMac(){}
    private static class innerHolder{
        private static final ConcreteFactoryForMac INSTANCE = new ConcreteFactoryForMac();
    }
    public static ConcreteFactoryForMac getInstance(){
        return innerHolder.INSTANCE;
    }
    @Override
    public IProductMouse createMouse() {
        return new ConcreteMouseForMac();
    }
    @Override
    public IProductKeyboard createKeyboard() {
        return new ConcreteKeyboardForMac();
    }
}
