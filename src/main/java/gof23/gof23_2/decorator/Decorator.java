package gof23.gof23_2.decorator;

import java.math.BigDecimal;

/**
 * 装饰者类：我与被装饰者类Coffee一样，也要实现相同的接口Drink，并持有被装饰者对象（通过关联一个接口的方式）。是调料类的父类
 */
public class Decorator extends Drink {

    private Drink drink; // 这里组合的是单品咖啡，或者是加了调料后的单品咖啡，都用接口来接收

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public BigDecimal cost() {
        return super.getPrice().add(drink.cost());
    }

    @Override
    public String getDes() {
        return drink.getDes() + "，" + super.getDes(); // 单品咖啡的des + 调料的des
    }
}
