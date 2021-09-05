package gof23.gof23_1.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * 问题：反射可以破坏单例
 * 方案：道高一尺，魔高一丈，反腐较量，见下各个test方法，最终方案：枚举，见Lazy5
 * 注意：反射会走构造器，但不会为全局变量赋值，只有new方法才能给全局变量赋值，TODO 待考证===
 */
public class Lazy5 {

    private volatile static Lazy5 lazyMan;

    // 对外提供静态方法
    public static Lazy5 getInstance() {
        if (lazyMan == null) {
            synchronized (Lazy5.class) {
                if (lazyMan == null) {
                    lazyMan = new Lazy5();
                }
            }
        }
        return lazyMan;
    }


    // 用于test1，new和反射都会走构造器哦
    private Lazy5() {
        synchronized (Lazy5.class) {
            if (lazyMan != null) {
                throw new RuntimeException("不要试图反射破坏单例111");
            }
        }
    }


    /**
     * 问题：通过静态方法与反射获取的两个实例，不是同一个，说明单例被破坏了
     * 方案：在构造器中加判断：不要试图反射破坏单例！
     * 新问题：如果每次获取都是用反射呢?见test2
     */
    @Test
    public void test1() throws Exception {
        Lazy5 instance1 = Lazy5.getInstance();

        Constructor<Lazy5> constructor = Lazy5.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Lazy5 instance2 = constructor.newInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }

    /**
     * 问题：改成两个实例都是反射获取，而不用getInstance方法，则单例又被破坏了
     * 疑问：TODO test1的构造器里，为何两个反射获取实例，就不报错了呢，第一次得到实例后，lazyMan不应当为null啊？
     * TODO 难道说反射获取的实例不会赋值给全局变量，导致lazyMan为null？
     */

    @Test
    public void test2() throws Exception {
        // 正常情况下，获取的是同一个实例
/*        Lazy4 instance = Lazy4.getInstance();
        Lazy4 instance3 = Lazy4.getInstance();
        System.out.println(instance);
        System.out.println(instance3);*/

        // 多次获取，都用反射，则单例又被破坏，方案：Lazy5
        Constructor<Lazy5> constructor = Lazy5.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Lazy5 instance1 = constructor.newInstance();
        Lazy5 instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);

    }


}