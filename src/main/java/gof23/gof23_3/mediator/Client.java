package gof23.gof23_3.mediator;

import org.junit.jupiter.api.Test;

/**
 * 中介者模式
 * 使用场景：***
 * 优点：通过将网状结构改造成星型结构，实现调用者(一个colleague)和被调用者(其他符合条件的colleague)解耦
 * 结构角色职责：
 * 客户端
 * 抽象中介者a
 * 具体中介者b
 * 抽象同事
 * 具体同事c
 * 具体同事d
 * <p>
 * 流程：***
 * 入门案例：婚介公司
 * 缺点：***
 * 应用举例：springmvc中c是m和v的中介者
 * 对比：***
 * 备注：要实现怎样的通知效果，只需修改中介者类即可。关键也在于维护这个中介者类
 */
public class Client {

    @Test
    public void test() {
        System.out.println();

        Mediator mediator = new ConcteteMediator();
        Colleague aColleague, bColleague;
        aColleague = new AColleague(mediator, "AColleague");
        bColleague = new BColleague(mediator, "BColleague");

        mediator.register(aColleague);
        mediator.register(bColleague);

        aColleague.send("hello~");
        System.out.println("----------------");
        bColleague.send("hihi~");

    }

}
