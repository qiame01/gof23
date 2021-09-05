package gof23.gof23_1.factory.abstractFactory;

public class BFactory implements AbstractFactory {
    @Override
    public Phone getPhone() {
        return new BPhone();
    }

    @Override
    public Router getRouter() {
        return new BRouter();
    }
}
