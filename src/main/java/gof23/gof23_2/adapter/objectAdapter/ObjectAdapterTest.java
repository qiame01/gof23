package gof23.gof23_2.adapter.objectAdapter;

import org.junit.Test;

/**
 * 适配器模式实现方式2/3：对象适配器模式
 */
public class ObjectAdapterTest {
    @Test
    public void test() {

        AClass aClass = new AClass(new BClass());
        String sss = aClass.cInterfaceDo1();
        System.out.println(sss);
    }
}

/**
 * 适配器类：里面关联（其实顺便使用了组合模式）了被适配类BClass（这里虽然写的是类，但严格应该是被适配类的接口，因为适配器模式连接的是两个不兼容的接口）
 */
class AClass implements CInterface {
    private BClass bClass;

    public AClass(BClass bClass) {
        this.bClass = bClass;
    }

    @Override
    public String cInterfaceDo1() {
        String ddd = bClass.bClassDo1();
        String nnn = ddd.toUpperCase();
        return nnn;
    }
}

/**
 * 被适配类
 */
class BClass {

    public String bClassDo1() {
        String aaa = "aaa";
        return aaa;
    }
}

/**
 * 适配器类的接口/抽象类
 */
interface CInterface {

    String cInterfaceDo1();
}
