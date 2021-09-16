package gof23.gof23_3.strategy.strategy1;

import org.junit.Test;

/**
 * 策略模式
 * TODO strategy1是策略模式的入门，一个组件完备的策略模式见下面的strategy2
 * 使用场景：取代多个if-else，提高扩展性
 * 优点：***
 * 结构角色职责：
 * 客户端
 * 环境类及其子类：如Bird和ABird、BBird。。名称可以不叫context
 * 策略接口/抽象类：可存在多个，如bird有FlyStrategy策略接口（fly();等待具体实现）、SpeakStrategy策略接口（speak();等待具体实现）
 * 具体策略类：
 * 如上面的FlyStrategy策略接口的2个具体策略实现类：FlyStrategy1（fly()：优雅地飞）、FlyStrategy2（fly()：不会飞）
 * 如上面的FlyStrategy策略接口的2个具体策略实现类：FlyStrategy1（speak()：嘤嘤嘤）、FlyStrategy2（speak()：嘎嘎嘎）
 * <p>
 * UML类图：***
 * 流程：***
 * 入门案例：鸟类的不同子类在fly()和speak()上拥有不同表现
 * 缺点：***
 * 应用举例：***
 * 对比：1与简单工厂模式结构相似，但侧重点不同 2与装饰者模式对比
 * 备注：
 * 1环境类这个角色并非总是会存在,名字也时常不叫context,若无,则其实是抽象策略接口承担了环境类的角色功能
 * 2环境类可以有一个或多个子类(完整版的策略模式见下面 strategy2)
 * 3环境类可以持有一个或多个策略类接口对象(完整版的策略模式见下面 strategy2)
 */
public class ClientTest {

    @Test
    public void test2() {
        // 条件模拟
        String type = "ConcreteStrategy1";

        // 实际中，要根据传进来的条件参数，判断采用哪种策略
        Strategy strategy = new ConcreteStrategy1();
        // Strategy strategy = new ConcreteStrategy2();

        // 方式1：无环境类的策略模式(直接使用接口方法)
        System.out.println(strategy.handle("aaa"));

        // 方式2：有环境类的策略模式(环境类方法底层实际仍然使用的是原来的策略接口方法)
        Context context = new Context(); // 创建环境类对象
        context.setStrategy(strategy); // 设置具体策略
        System.out.println(context.contextHandle("aaa")); // 执行环境类的统一方法(底层还是接口规定的方法)
    }
}
