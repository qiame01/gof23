package gof23.gof23_3.template;

/**
 * 抽象模板类
 * 使用场景：行为是按照固定的顺序执行的时候
 * 优点：***
 * 结构角色职责：
 * 客户端、
 * 抽象模板：包含四类方法：模板方法(规定执行顺序)、抽象方法(交由子类视情具体实现)、具体通用方法、钩子方法(默认不做任何事情，但用于补偿或给流程传入条件)
 * 具体模板
 * <p>
 * 流程：***
 * 入门案例：银行办理业务取号排队流程、炒菜流程
 * 缺点：***
 * 应用举例：***
 * 对比：***
 * 备注：
 * 上述四类方法，每类方法都可以有不止一个
 */
public abstract class Template {

    public final void templateMethod() {
        aStep();
        bStep();
        cStep();
        dStep();
    }

    public void aStep() {
        System.out.println("取号");
    }

    public void bStep() {
        System.out.println("排队");
    }

    public abstract void cStep(); // 办理具体业务

    public abstract void dStep(); // 评价


    public void hook() {
        System.out.println("钩子方法，用于补偿或给流程传入条件");
    }

}
