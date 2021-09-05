package gof23.gof23_3.observer;

/**
 * 具体观察者
 * 其实就是用户或订阅者,用来接收推送消息
 */
public class AObserver extends Observer {

    public AObserver(String name) {
        super(name);
    }

    @Override
    public void update(String aaa) {
        System.out.println("AObserver 接收到推送：" + aaa);
    }
}
