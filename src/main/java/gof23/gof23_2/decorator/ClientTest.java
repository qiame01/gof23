package gof23.gof23_2.decorator;

import org.junit.Test;

public class ClientTest {
    @Test
    public void test1() {
        Drink drink = new ACoffee();
        System.out.println("单品咖啡ACoffee订单 = " + drink.getDes());

        drink = new ADecorator(drink);
        System.out.println("加调料ADecorator后订单 = " + drink.getDes());

    }

    /**
     * 装饰者模式的优势：
     * 可灵活追加新的单品咖啡类(即Coffee的子类，如BCoffee)
     * 可灵活追加新的调料类(即Decorator的子类，如BDecorator)
     * 一份单品对象可以嵌套无限次的调料类对象(而桥接模式则不可以嵌套)
     */
    @Test
    public void test2() {

        Drink drink = new ACoffee();
        System.out.println("单品咖啡ACoffee订单 = " + drink.getDes());

        drink = new ADecorator(drink);
        System.out.println("加一份调料ADecorator后订单 = " + drink.getDes());

         drink = new ADecorator(drink);
        System.out.println("加两份调料ADecorator后订单 = " + drink.getDes());

        // TODO ADecorator可以灵活改为BDecorator，即更换别的调料
        // drink = new BDecorator(drink);

    }
}
