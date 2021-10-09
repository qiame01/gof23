package gof23.gof23_3.strategy;

import org.junit.Test;

/**
 * 策略模式
 * UML类图关系：
 * 客户端
 * 环境类及其子类：如Bird和ABird、BBird。。名称可以不叫context
 * 策略接口/抽象类：可存在多个，如bird有FlyStrategy策略接口（fly();等待具体实现）、SpeakStrategy策略接口（speak();等待具体实现）
 * 具体策略类：如上面的FlyStrategy策略接口的2个具体策略实现类：FlyStrategy1（fly()：优雅地飞）、FlyStrategy2（fly()：不会飞）
 * 使用场景：取代多个if-else，提高扩展性。例如，鸟类的不同子类在fly()上拥有不同表现
 * 常见形式：1把strategy作为参数传入context   2根据传入的参数type遍历匹配context里strategyMap里的相应的那个strategy（代码待补充）
 * 优点：***
 * 缺点：***
 * 应用：***
 * 对比：1与简单工厂模式结构相似，但侧重点不同 2与装饰者模式对比
 * 备注：
 * 1环境类这个角色并非总是会存在,名字也时常不叫context,若无,则其实是抽象策略接口承担了环境类的角色功能
 *
 */
public class ClientTest {

    @Test
    public void test2() {
        Context context = new Context("lisi"); // 创建环境类对象

        // 方式1：可以无环境类：获取具体strategy时，依赖倒置接收，并直接调用接口方法（类似63013的route方法）
        // strategy.handle("aaa"); // 参数非必输

        // 方式2：用map储存所有strategy：根据入参type（如“1”），获取map里的对应strategy，同时每个strategy实现接口的对外getType方法
        // 待整理（类似63013的route方法）
        // 所有strategy在spring初始化容器时，就加载到spring容器里，并注入到context或者client里作为成员变量

        // 方式3：有环境类的策略模式：环境类方法底层实际仍然使用的是原来的策略接口方法
        Strategy strategy = new StrategyA();
        context.setStrategy(strategy); // 设置具体策略
        context.contextHandle("bbb"); // 执行环境类的统一方法(底层还是接口规定的方法)
    }
}
