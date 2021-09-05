package gof23.gof23_1.factory.abstractFactory;

public class AFactory implements AbstractFactory {
    @Override
    public Phone getPhone() {
        return new APhone();
    }

    @Override
    public Router getRouter() {
        return new ARouter();
    }
}
