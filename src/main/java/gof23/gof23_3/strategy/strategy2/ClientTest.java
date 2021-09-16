package gof23.gof23_3.strategy.strategy2;

import org.junit.Test;

/**
 * 策略模式
 * 本例详述了组件完备情形下的策略模式，即存在多个抽象策略角色(StrategyFly等)、存在多个环境角色(ABird等)
 */
public class ClientTest {
    @Test
    public void test() {
        Bird bird1 = new ABird("夜莺");
        bird1.setStrategyFly(new StrategyFly1());
        bird1.setStrategySpeak(new StrategySpeak1());
        bird1.show();

        Bird bird2 = new BBird("鸭鸭");
        bird2.setStrategyFly(new StrategyFly2());
        bird2.setStrategySpeak(new StrategySpeak2());
        bird2.show();
    }
}
