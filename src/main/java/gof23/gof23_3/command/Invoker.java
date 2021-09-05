package gof23.gof23_3.command;

/**
 * 命令调用者
 * 相当于传单的服务员(单子即命令类a，a会调用厨师这个接收者干活) 或调用内置程序的遥控器(程序即命令类a，a会调用具体按钮这个接收者干活)
 * <p>
 * 组合方式：
 * 1组合单个 Command
 * 2组合 List<Command>  (数据库底层是事务管理就是类似结构)
 * (这类似于备忘录模式里的管理者CareTaker有三种组合状态的场景)
 */
public class Invoker {

    // 这里演示组合一个命令类。其他方式如组合命令类的list等方式请自行探索
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    void invokerDo() {
        command.commandDo();
    }

}
