package gof23.gof23_3.mediator;

/**
 * 同事类A
 */
public class AColleague extends Colleague {

    public AColleague(Mediator mediator, String name) {
        super(mediator, name);
    }
    public AColleague() {
    }
    @Override
    public void receive(String message) {
        System.out.println("AColleague receive：" + message);
    }

    @Override
    public void send(String message) {
        // 处理自己的业务逻辑
        System.out.println("AColleague send：" + message);
        // 调用中介者的方法
        mediator.relay(this, message);
    }

}
