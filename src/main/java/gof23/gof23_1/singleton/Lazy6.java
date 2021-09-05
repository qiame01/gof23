package gof23.gof23_1.singleton;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * 终章：使用枚举，可以防止反射破坏单例（查看newInstance()的源码）
 * 问题：但是这里用的是枚举，如何保证Lazy里的实体类是单例呢？好像只能用Lazy3或者4，毕竟风险总是无法完全避免
 * 注意：idea的编译工具和jdk的javap -s 反编译后，结果欺骗了我们：给出了一个无参构造。使用jad.exe工具反编译后，发现只有一个有参构造，
 * 故反射时使用该有参构造，并传值进去就，就可以防止反射破坏单例
 */
public enum Lazy6 {
    INSTANCE;

    public static Lazy6 getInstance() {
        return INSTANCE;
    }

}

class Teste {

    /**
     * 反射无法破坏枚举的单例
     */
    @Test
    public void test2() throws Exception {
//        Lazy6 instance = Lazy6.getInstance();
//        Lazy6 instance1 = Lazy6.getInstance(); // 或者下面两个
        Lazy6 instance = Lazy6.INSTANCE;
        Lazy6 instance3 = Lazy6.INSTANCE;
        System.out.println(instance == instance3);

       /* Constructor<Lazy6> constructor = Lazy6.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Lazy6 instance2 = constructor.newInstance();
        System.out.println(instance2);
*/

    }

}
