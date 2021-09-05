package gof23.gof23_3.state;

import org.junit.jupiter.api.Test;

/**
 * 使用场景：
 * 应用程序的部分对象可能会根据不同的情况做出不同的行为。我们把这种对象称为有状态的对象。而把影响对象行为的一个或多过动态变化的属性称为状态。当有状态的对象与外部事件产生互动时，其内部状态就会发生改变，从而使其行为也发生改变。
 * 状态模式解题思路，适当控制一个对象状态转换的条件表达式过于复杂时，把相关判断逻辑提取出来，用各个不同的类进行表示系统处于那种情况，直接使用相映的状态类对象进行处理。目的是消除if else switch case等冗余语句，代码更有层次性，具备良好的扩展能力。
 * <p>
 * 优点：1取代了if-else、switch-case  2符合开闭原则
 * 结构角色职责：
 * 1客户端。实例化环境类对象d，调用其处理方法并传入参数c(比如分数)，以触发状态切换(比如分数决定等级优良中差)。
 * 2环境类(组合了状态接口/抽象类)。环境类的处理方法b中需要接收客户端传来的参数c，并连同环境类对象d，一起传递给具体状态实现类的同名方法。
 * 3状态接口/抽象类a。a定义了抽象方法e。e接收c和d。
 * 4a的实现类bc...。重写/实现抽象方法e，进行本状态下的具体业务处理。
 * 流程：客户端实例化一个环境类，调用其handle方法并传入参数，该参数用于触发状态类之间的切换，最终由每个状态类自己的handle方法具体处理
 * 入门案例：传入分数，切换决定优良中差四种状态
 * 缺点：状态类可能会比较多
 * 备注：
 * 状态模式跟其他模式一样。在实际使用中千变万化。会有各种各样的变种。但原理不变。比如状态模式核心思想是根据不同状态来切换行为，其实这里的状态可以是任意属性，如投票次数或分数。根据该属性具体属性值的不同，同一功能会走不同的具体实现方法。
 * 处理业务逻辑时，handle方法可能需要传入环境类对象a和客户端传递的参数b，其中a可用于获取和设置环境类里的属性或方法(这里暂略)。
 * 应用举例：线程状态
 * 对比：***
 */
public class Client {

    @Test
    public void test() {
        Context context = new Context();
//        context.handle("-1");
//        context.handle("60");
        context.handle("101");
    }
}