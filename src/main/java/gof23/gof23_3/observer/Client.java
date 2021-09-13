package gof23.gof23_3.observer;

import org.junit.Test;

/**
 * 观察者模式
 * 使用场景：一对多依赖关系下，一个对象状态改变，引起与之相关的n个对象状态的改变
 * 优点：***
 * 结构角色职责：
 * 抽象主题：组合了一个观察者的list,并提供add、remove方法，还必须提供一个抽象的通知方法。类似一个抽象的公众号接口
 * 具体主题ab：抽象主题的实现类，必须实现具体的通知方法。类似众多具体的公众号
 * 抽象观察者：即用户或订阅者，用来接收主题类推送的信息
 * 具体观察者abc：抽象观察者的实现类,提供update方法
 * <p>
 * UML类图：***
 * 流程：***
 * 入门案例：公众号消息的发布-订阅
 * 缺点：***
 * 应用举例：***
 * 对比：***
 * 备注：又叫【发布-订阅模式】
 */
public class Client {
    @Test
    public void test() {

        // 初始化公众号、用户
        Subject aSubject = new ASubject();
        // Subject bSubject = new BSubject(); // 扩展一个新的公众号很方便

        Observer aObserver = new AObserver("AObserver");
        Observer bObserver = new BObserver("BObserver");
        System.out.println("初始化公众号、用户");

        // 用户订阅公众号
        aSubject.add(aObserver);
        aSubject.add(bObserver);
        System.out.println("用户订阅公众号,当前订阅人数：" + aSubject.observers.size());


        // 公众号发出推送新闻,用户接收到推送消息
//        String bbb = "房价回落,赶紧买房";
        String bbb = null;
        aSubject.setNews(bbb);

        // 用户取关
        aSubject.remove(aObserver);
        System.out.println("用户取关：用户向公众号发出取关的请求,公众号收到请求后,从订阅列表中移除该用户。当前订阅人数：" + aSubject.observers.size());

        // 公众号更新推送。。实际中的更新信息,应当定时从数据库或中间件中获取
        System.out.println("公众号更新推送：");
        bbb = "房价回落,赶紧出售";
        aSubject.setNews(bbb);
    }
}
