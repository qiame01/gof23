package gof23.gof23_3.strategy.strategy1;

/**
 * 环境类
 * 环境类可以有一个或多个子类，且可以持有一个或多个策略类接口对象。。完整版的策略模式见下面 strategy2
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String contextHandle(String param) {
        String handle = strategy.handle(param);
        return handle;
    }
}
