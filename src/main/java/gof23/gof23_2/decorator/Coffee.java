package gof23.gof23_2.decorator;

import java.math.BigDecimal;

/**
 * 被装饰者类。我还有具体子类ACoffee，是个单品咖啡
 */
public class Coffee extends Drink{
    @Override
    public BigDecimal cost() {
        return super.getPrice();
    }
}
