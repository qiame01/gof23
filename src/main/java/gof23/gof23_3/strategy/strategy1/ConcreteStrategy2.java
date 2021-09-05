package gof23.gof23_3.strategy.strategy1;

public class ConcreteStrategy2 implements Strategy {

    @Override
    public String handle(String param) {
        param = param + "(ConcreteStrategy2 处理后)";
        return param;
    }

}
