package gof23.gof23_1.singleton;

/**
 * 针对Lazy中线程安全问题，给出如下方案
 * 方案1：同步方法：可行，但每次获取实例都同步，效率低，不推荐
 * 方案2：DCL懒汉式：防止并发问题，不影响效率，推荐
 */
public class Lazy2 {

    private static Lazy2 lazyMan;

    private Lazy2() {
        // 打印一次，说明执行构造方法一次，即创建一个新的实例
        System.out.println(Thread.currentThread().getName() + "---ok");
    }


    // 方案1：同步方法。可行，但每次获取实例，都要同步一次，效率低
/*    public synchronized static Lazy2 getInstance() {
        if (lazyMan == null) {
            lazyMan = new Lazy2();
        }
        return lazyMan;
    }*/

    // 方案2：双重检测锁模式，即DCL懒汉式
    public static Lazy2 getInstance() {
        if (lazyMan == null) {
            synchronized (Lazy2.class) {
                // 注意：TODO 若此处不加第二次判断，则无法防止线程安全问题，原因与前面的Lazy类原因相同
                if (lazyMan == null) {
                    lazyMan = new Lazy2();
                }
            }
        }
        return lazyMan;
    }

    // 多线程并发
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Lazy2.getInstance();
            }).start();
        }
    }
}