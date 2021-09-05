package gof23.gof23_3.mediator;

/**
 * 抽象中介者，核心方法是relay 转发方法
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague, String message);

}
