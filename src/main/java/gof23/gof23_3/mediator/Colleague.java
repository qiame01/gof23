package gof23.gof23_3.mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;
    private String name;

    // mediator的初始化(也可以用下面的setMediator方法,然后在【colleagues.add(colleague)】的下面 setMediator)
    // 当然set方法比构造器方式更有利于解耦
    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Colleague() {
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 抽象方法，由子类重写
    public abstract void receive(String message);

    public abstract void send(String message);


}
