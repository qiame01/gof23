package gof23.gof23_3.responsibilityChain;

/**
 * 抽象处理者
 */
public abstract class Handler {
    protected String name;
    protected Handler nextHandler;
    protected int handlerLevel;

    // 注意 nextHandler 这个属性，最好用set设置，而不用构造器，以便解耦
    public Handler(String name, int handlerLevel) {
        this.name = name;
        this.handlerLevel = handlerLevel;
    }

    public Handler() {
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);

}
