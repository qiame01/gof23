package gof23.gof23_3.command;

import org.junit.Test;

/**
 * 命令模式
 * 结构角色流程：客户端、命令调用者、抽象命令类/接口、具体命令类A和B、命令接收者
 * 使用场景：
 * 入门案例：顾客下单，服务员（调用者）送单（命令类）给厨师（接收者），厨师做饭。
 * 优点：通过在命令调用者和接受者之间增加命令类，实现命令的调用者和接收者的解耦。如服务员把单子放下即可，无需等着厨师，从而解耦。
 * 缺点：
 * 备注：最终实际干活的是战士，即接收者
 */
public class ClientTest {

    @Test
    public void test() {
        ACommand aCommand = new ACommand(new Receiver());
        Invoker invoker = new Invoker(aCommand);
        invoker.invokerDo();

        BCommand bCommand = new BCommand(new Receiver());
        Invoker invoker2 = new Invoker(bCommand);
        invoker2.invokerDo();
    }
}
