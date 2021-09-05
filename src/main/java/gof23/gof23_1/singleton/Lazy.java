package gof23.gof23_1.singleton;

import org.junit.jupiter.api.Test;

/**
 * 懒汉式单例：需要用到时，才创建实例。
 * 懒汉式单例特点：懒加载，故可以节省内存，缺点：并发场景下线程安全问题，下面和以后几个类就是围绕线程安全而展开的
 *
 * 本例是懒汉式单例的原生形式：并发场景下单例被破坏，故原生形式不可用，原因见下
 */
public class Lazy {

    private static Lazy lazyMan;

    private Lazy() {
        // 打印一次，说明执行构造方法一次，即创建一个新的实例
        System.out.println(Thread.currentThread().getName() + "---ok");
    }

    public static Lazy getInstance() {
        // 原因：如果线程A进入此处判断内部后，还未来得及往下执行创建实例并跳出if，线程B也进入该if并通过该判断，这时就会产生多个实例
        if (lazyMan == null) {
            lazyMan = new Lazy();
        }
        return lazyMan;
    }

    // 多线程并发
    @Test
    public void test() throws Exception {
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                Lazy.getInstance();
            }).start();
        }
    }
}