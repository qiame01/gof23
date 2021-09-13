package gof23.gof23_1.prototype;

import org.junit.Test;

import java.util.Date;

/**
 * 克隆模式：分为浅克隆（针对非组合场景）、深克隆（针对组合场景）
 */
public class CloneTest {

    /**
     * 浅克隆：克隆后的对象，其内部的组合对象属性依然指向原类中的属性，导致二者共用同一个对象属性
     * 即克隆后，每个对象应该拥有自己的组合属性，而不是共用同一个
     */
    @Test
    public void test() throws CloneNotSupportedException {
        Date date = new Date();
        ClassA classA = new ClassA("高维方法工具产生高维实践", date);
        ClassA clone = (ClassA) classA.clone();

        System.out.println(classA);
        System.out.println(clone);
        System.out.println(classA.hashCode());
        System.out.println(clone.hashCode());

        date.setTime(23587565); // 重置了原类date，发现在克隆类中的date也被修改了。故在ClassB中进行优化
        System.out.println(classA);
        System.out.println(clone);
        System.out.println(classA.hashCode());
        System.out.println(clone.hashCode());
    }

    /**
     * 深克隆
     */
    @Test
    public void test2() throws CloneNotSupportedException {
        Date date = new Date();
        ClassB classA = new ClassB("高维方法工具产生高维实践", date);
        ClassB clone = (ClassB) classA.clone();

        System.out.println(classA);
        System.out.println(clone);
        System.out.println(classA.hashCode());
        System.out.println(clone.hashCode());

        date.setTime(23587565); // 再次重置date，发现只影响了原类，符合预期
        System.out.println(classA);
        System.out.println(clone);
        System.out.println(classA.hashCode());
        System.out.println(clone.hashCode());
    }

}
