package AbstractFactory;

public class ConcreteFactoryForWin implements IFactory{

    private ConcreteFactoryForWin (){}

    private static class innerHolder{
        private static final ConcreteFactoryForWin INSTANCE = new ConcreteFactoryForWin();
    }
    public static ConcreteFactoryForWin getInstance(){
        return innerHolder.INSTANCE;
    }
    @Override
    public IProductMouse createMouse() {
        return new ConcreteMouseForWin();
    }

    @Override
    public IProductKeyboard createKeyboard() {
        return new ConcreteKeyboardForWin();
    }
}
