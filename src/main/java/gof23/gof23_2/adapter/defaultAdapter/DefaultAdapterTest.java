package gof23.gof23_2.adapter.defaultAdapter;

import org.junit.jupiter.api.Test;

/**
 * 适配器模式实现方式3/3：缺省适配器模式
 */
public class DefaultAdapterTest {
    @Test
    public void test() {

        // 使用匿名内部类作为适配器类，也可以使用有名子类
        AbstractClass abstractClass = new AbstractClass() {

            // 相中哪个方法，就单独实现该方法
            @Override
            public void dInterfaceDo1() {
                System.out.println(String.format("%s - %d", "ggg", 888));
            }
        };

        abstractClass.dInterfaceDo1();
    }
}

/**
 * 对接口方法做空实现，由子类具体实现某个需要被实现的方法
 */
abstract class AbstractClass implements DInterface {

    @Override
    public void dInterfaceDo1() {
    }

    @Override
    public void dInterfaceDo2() {
    }

    @Override
    public void dInterfaceDo3() {
    }
}

/**
 * 接口
 */
interface DInterface {
    void dInterfaceDo1();

    void dInterfaceDo2();

    void dInterfaceDo3();
}
