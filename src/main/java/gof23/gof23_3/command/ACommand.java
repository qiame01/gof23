package gof23.gof23_3.command;

/**
 * 具体命令类
 * 处在中间，实现了调用者和接收者的解耦
 * 内部组合了接收者，用来实际干活
 */
public class ACommand implements Command{

    Receiver receiver;

    public ACommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void commandDo() {
        receiver.receiverDo1();
    }
}
