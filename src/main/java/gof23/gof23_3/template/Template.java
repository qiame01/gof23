package gof23.gof23_3.template;

/**
 * 抽象模板类
 */
public abstract class Template {
    // 钩子方法的判断标记，默认为 true,这个判断标记就像是开关一样
    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public final void templateMethod() {
        aStep();
        // 钩子方法使用，如果钩子方法返回的是 false，就跳过bStep
        if (this.hook()) {
            bStep();
        }
        cStep(); // 调用子类重写方法
        dStep(); // 调用子类重写方法
        // callback(); // 钩子方法放在这里也可以，名字可变
    }

    public void aStep() {
        System.out.println("取号");
    }

    public void bStep() {
        System.out.println("排队");
    }

    public abstract void cStep(); // 办理具体业务

    public abstract void dStep(); // 评价

    // 钩子方法可叫 hook()或者叫callback()或其他，位置也灵活，还可以放在最后作为回调函数，反正使用时不拘一格，根据原理进行灵活变化，非必要
    public boolean hook() {
        System.out.println("执行钩子方法，用于补偿或给流程传入条件，处理逻辑和返回值类型均可以自定义");
        return this.flag;
    }

}
