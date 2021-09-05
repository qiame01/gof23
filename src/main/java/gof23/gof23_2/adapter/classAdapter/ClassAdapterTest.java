package gof23.gof23_2.adapter.classAdapter;

import org.junit.jupiter.api.Test;

/**
 * 适配器模式实现方式1/3：类适配器模式
 */
public class ClassAdapterTest {
    @Test
    public void test() {

        AClass aClass = new AClass();
        String sss = aClass.cInterfaceDo1();
        System.out.println(sss);
    }
}

/**
 * 适配器类：实现自己接口里的新方法A(cInterfaceDo1)，并在A中调用原始方法B(bClassDo1)
 */
class AClass extends BClass implements CInterface {

    @Override
    public String cInterfaceDo1() {
        String ddd = bClassDo1(); // 在新方法中调用旧方法，从而实现两个接口在一起工作
        String nnn = ddd.toUpperCase();
        return nnn;
    }
}

/**
 * 被适配类：提供原始方法B
 */
class BClass {

    public String bClassDo1() {
        String aaa = "aaa";
        return aaa;
    }
}

/**
 * 适配器类的接口：提供新方法A(TODO 也可以是具体类？)：定义新方法
 */
interface CInterface {

    String cInterfaceDo1();
}
