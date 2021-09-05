package gof23.gof23_3.observer;

public class BObserver extends Observer {
    public BObserver(String name) {
        super(name);
    }

    @Override
    public void update(String aaa) {
        System.out.println("BObserver 接收到推送：" + aaa);
    }
}
