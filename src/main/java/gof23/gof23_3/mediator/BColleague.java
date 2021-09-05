package gof23.gof23_3.mediator;

/**
 * 同事类B
 */
public class BColleague extends Colleague {

    public BColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    public BColleague() {
    }

    @Override
    public void receive(String message) {
        System.out.println("BColleague receive：" + message);
    }

    @Override
    public void send(String message) {
        // 处理自己的业务逻辑
        System.out.println("BColleague send：" + message);
        // 调用中介者的方法
        mediator.relay(this, message);
    }

}
