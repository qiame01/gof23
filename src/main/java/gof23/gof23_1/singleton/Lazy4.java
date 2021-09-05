package gof23.gof23_1.singleton;

import org.junit.jupiter.api.Test;

/**
 * 静态内部类实现懒汉式单例，可用，原因如下：
 * 1外部类装载时，静态内部类不会被加载（这是静态内部类的特点），达到懒加载效果
 * 2jvm特性是在装在类的时候（包括静态内部类），线程是安全的
 * 3静态内部类下的静态变量，全局唯一，保证单例
 *
 */
public class Lazy4 {

//    private static Lazy4 lazyMan;

    private Lazy4() {
        System.out.println(Thread.currentThread().getName() + "---ok");
    }

    private static class InnerStaticClass {
        private static final Lazy4 INSTANCE = new Lazy4();
    }

    public static Lazy4 getInstance() {
        return InnerStaticClass.INSTANCE;
    }

    // 多线程并发
    @Test
    public void test() throws Exception {
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                Lazy4.getInstance();
            }).start();
        }
    }
}