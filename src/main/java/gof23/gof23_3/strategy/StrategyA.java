package gof23.gof23_3.strategy;

/**
 * 具体策略类，是本模式里唯一的可扩展维度
 * 相当于一个if条件情形
 */
public class StrategyA implements Strategy {

    @Override
    public void handle(String param) {
        System.out.println("执行 StrategyA 策略");
    }

}
