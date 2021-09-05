package gof23.gof23_2.decorator;

import java.math.BigDecimal;

/**
 * 装饰者类的子类：这里是具体调料
 */
public class ADecorator extends Decorator {
    public ADecorator(Drink drink) {
        super(drink);
        setDes("调料ADecorator");
        setPrice(new BigDecimal(3.0)); // 设置调味品的价格
    }
}
