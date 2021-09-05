package gof23.gof23_3.strategy.strategy1;

/**
 * 具体策略类
 * 相当于一个if条件情形
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public String handle(String param) {
        param = param + "(ConcreteStrategy1 处理后)";
        return param;
    }

}
