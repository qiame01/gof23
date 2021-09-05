package gof23.gof23_2.bridge;

import org.junit.jupiter.api.Test;

/**
 * 使用场景：桥接模式适用于一个系统具有两个独立变化维度，且一个维度需要调用另外一个维度的方法这样的场景
 * 优点：两个维度可以各自独立进行扩展，有利于系统的分层设计。代替多层继承，可减少子类个数
 * 结构角色流程：客户端、桥接类(可抽象)、桥接类子类、行为接口、行为接口实现类
 * 入门案例：电脑两个维度：类型(如APhone折叠型、BPhone触屏型)和品牌。。另外，虚拟机使用的是桥接模式，不同的Java虚拟机组合了不同的操作系统。
 * 缺点：桥接模式适用于一个系统具有两个独立变化维度，适用范围有一定限制
 * 备注：
 * 桥接模式和适配器模式的异同：
 * 相似：代码结构上有些相似性，都是在两个类之间建立联系，在一个类方法中调用另外一个类方法
 * 不同：
 * 适配器模式下被连接的两个类并不属于某个产品的两个维度，因而不会各自扩展。
 * 而桥接模式下，两个类属于同一个产品的两个维度，存在朝各自维度进行扩展的需要。
 */
public class ClientTest {
    @Test
    public void test() {
        System.out.println("-------------------------现有品牌、类型");
        APhone aPhone = new APhone(new ABrand());
        aPhone.open();
        aPhone.call();
        aPhone.close();
        System.out.println("-------------------------桥接模式可灵活从产品的第一个维度扩展新类");
        APhone aPhone2 = new APhone(new BBrand());
        aPhone2.open();
        aPhone2.call();
        aPhone2.close();
        System.out.println("-------------------------桥接模式可灵活从产品的第二个维度扩展新类");
        BPhone bPhone = new BPhone(new BBrand());
        bPhone.open();
        bPhone.call();
        bPhone.close();
    }
}
