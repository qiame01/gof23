package gof23.gof23_3.responsibilityChain;

import org.junit.Test;

/**
 * 职责链模式，也叫责任链模式
 * 使用场景：***
 * 优点：***
 * 结构角色职责：
 * 客户端
 * 请求类
 * 抽象处理者
 * 具体处理者abcd。。。
 * <p>
 * 流程：***
 * 入门案例：请假审批
 * 缺点：***
 * 应用举例：***
 * 对比：***
 * 备注：
 * 1必须将第一个处理者set到最后一个处理者里，形成闭环，防止不从第一个开始处理请求这种情形
 * 2实际中，一般用一个类组合一个list来存放所有的处理者，这样似乎关系到了另一种模式，各个模式不是绝对独立的
 */
public class Client {
    @Test
    public void test() {
        // 以后一般用一个类组合一个list来存放所有的处理者
        Handler aHandler = new AHandler("弈秋", 1);
        Handler bHandler = new BHandler("过百龄", 2);
        Handler cHandler = new CHandler("范西屏", 3);

        aHandler.setNextHandler(bHandler);
        bHandler.setNextHandler(cHandler);
        // TODO 注意：必须将第一个处理者set到最后一个处理者里，形成闭环，防止不从第一个开始处理请求这种情形
        cHandler.setNextHandler(aHandler);

        Request request = new Request("张三", "回家探亲", "3");
        bHandler.handleRequest(request);
    }
}
