package gof23.gof23_3.observer;

/**
 * 抽象观察者
 * 其实就是用户或订阅者,用来接收推送消息
 */
public abstract class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    abstract void update(String aaa);
}
