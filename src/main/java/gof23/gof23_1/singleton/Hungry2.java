package gof23.gof23_1.singleton;

/**
 * 饿汉式方式二：静态代码块
 */
public class Hungry2 {

    // 饿汉式单例：类一加载就创建实例
    private static Hungry2 hungry;

    static {
        hungry = new Hungry2();
    }

    private Hungry2() {

    }

    public static Hungry2 getInstance() {
        return hungry;
    }

}