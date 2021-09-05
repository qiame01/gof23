package gof23.gof23_1.singleton;

/**
 * 饿汉式单例：类一加载就创建实例
 * 饿汉式方式一：静态变量
 * 问题：有多种方式导致该类被加载，可能并不会被用到，从而会浪费内存，因而产生了另一种单例：懒汉式单例
 */
public class Hungry {

    // 单例模式下，构造器必须私有，不允许外部创建，以保证只创建一个实例
    private Hungry() {

    }

    // 饿汉式单例：类一加载就创建实例
    private static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;

    }
}