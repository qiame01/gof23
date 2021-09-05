package gof23.gof23_1.singleton;

import org.junit.jupiter.api.Test;

/**
 * 问题：DCL懒汉式单例下，依然存在风险：
 * 由于JVM底层模型原因，偶尔出现问题，不建议使用。即
 * new Lazy2()不是一个原子性操作，实际包含了三步，故极端下可能会发生指令重排，导致执行顺序不是123，可能是132等，见下
 * 方案：在属性名前添加修饰符：volatile，防止发生指令重排，这样就形成：双重检查锁 + 原子性操作
 */
public class Lazy3 {

    private volatile static Lazy3 lazyMan;

    private Lazy3() {
        System.out.println(Thread.currentThread().getName() + "---ok");
    }


    // 双重检测锁模式，即DCL懒汉式
    public static Lazy3 getInstance() {
        if (lazyMan == null) {
            synchronized (Lazy3.class) {
                if (lazyMan == null) {
                    lazyMan = new Lazy3();
                }
            }
        }
        /*
        new Lazy2()不是一个原子性操作，实际包含了三步
        1为对象分配内存空间（该对象此时只是定义了，还未被初始化，即还未执行构造方法）
        2执行构造方法，初始化对象
        3把这个对象指向这个空间

        极端下可能发生指令重排，致使执行顺序可能是132，即cpu可以先为定义的属性已经在线程A中指向空间了，会误以为对象不为空，就会直接返回分配空间，再指向空间，最后才初始化对象并把该对象放入该空间
        这在单个线程下，执行132是没问题的，反正会立刻执行构造，把对象放入空间
        但是并发场景下，线程B检测到对象未经构造的虚无对象
     */
        return lazyMan;
    }

    // 多线程并发
    @Test
    public void test() throws Exception {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Lazy3.getInstance();
            }).start();
        }
    }
}