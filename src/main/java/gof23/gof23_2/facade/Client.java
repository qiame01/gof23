package gof23.gof23_2.facade;

import org.junit.jupiter.api.Test;

/**
 * 使用场景：当系统需要进行分层设计，或调用子系统比较麻烦的时候
 * 优点：通过外观类这个代理类，为客户端提供调用子系统的统一接口，从而实现了客户端与子系统之间的解耦。典型体现了迪米特原则(最少知道原则)
 * 结构角色职责：客户端、外观类(是客户端与子系统交互的代理人)、子系统abc
 * 流程：外观类封装了各个子系统及其方法，然后客户端调用外观类这个代理人即可
 * 入门案例：开公司需要与工商局、银行、质检局等机构交互
 * 缺点：***
 * 应用举例：DBUtils封装了jdbc相关操作
 * 对比：***
 */
public class Client {
    /**
     * 原来注册公司以及后续贷款纳税等，需要自己亲自挨个与各个子系统进行交互，耦合性太强。
     */
    @Test
    public void register() {
        SubSystem1 subSystem1 = new SubSystem1(); // 工商局
        SubSystem2 subSystem2 = new SubSystem2(); // 质检局
        SubSystem3 subSystem3 = new SubSystem3(); // 银行

        System.out.println("公司注册--需要去如下机构办理的事项");
        subSystem1.do1();
        subSystem2.do1();
        System.out.println("-----------------------------------");

        System.out.println("注册后经营期间-纳税、质检、贷款、还款-需要去如下机构办理的事项");
        // 注册后，公司在经营期间可能需要办理的事项：比如纳税、质检、贷款、还款等
        subSystem1.do2();
        subSystem2.do2();
        System.out.println("-----------------------------------");

    }

    /**
     * 方案：使用外观模式，通过外观类这个代理人来封装与各个子系统的交互，隐蔽了细节，实现了客户与子系统的解耦
     */
    @Test
    public void registerByFacade() {
        Facade facade = new Facade();
        facade.register();
        facade.loan();
        facade.tax();
    }
}
