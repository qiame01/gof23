package gof23.gof23_3.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 */
public class ConcteteMediator extends Mediator {
    // colleague 的list注册列表(推荐list，当然也可以使用map)
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (colleagues.contains(colleague)) {
            System.out.println("该 colleague 已经注册");
            return;
        }
        colleagues.add(colleague);

        // 用于Colleague里mediator的初始化不是用构造器，而是set方法时的情形。。TIDO this的这个反向设置有点意思，学着点哈
        // 当然set方法比构造器方式更有利于解耦
        // colleague.setMediator(this);

    }

    /**
     * 注意参数分为两类，一个是colleague，一个是message。作用如下：
     * colleague 可以用来过滤出其他 colleague
     * message 也可以用来过滤出 colleague
     * message 还可以用来触发某个 colleague的一组方法(需不同参数来触发)，如 message=1或2时，分别执行AColleague的do1(),do2()
     */
    @Override
    public void relay(Colleague colleague, String message) {
        for (Colleague colleague1 : colleagues) {
            // 如果传进来的是 AColleague,则执行 BColleague receive()。。(模拟了一个联动场景)
            if (colleague.getName().equals("AColleague")) {
                if (colleague1 instanceof BColleague) {
                    colleague1.receive(message);
                }
            } else if (colleague.getName().equals("BColleague")) {
                if (colleague1 instanceof AColleague) {
                    colleague1.receive(message);
                }
            } else {
                System.out.println("------------");
            }

        }

    }
}
