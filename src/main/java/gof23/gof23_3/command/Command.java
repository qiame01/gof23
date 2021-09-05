package gof23.gof23_3.command;

/**
 * 命令抽象类/接口：包含所有命令
 * 命令接口或其实现类，内部会组合一个接收者
 */
public interface Command {
    // 在命令方法里可添加额外操作，如记录日志，添加事务等
    void commandDo();

}
