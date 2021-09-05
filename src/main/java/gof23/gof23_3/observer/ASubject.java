package gof23.gof23_3.observer;

/**
 * 具体主题
 * 组合了一个观察者的list,并提供add、remove方法，重写了通知方法
 * 类似具体的公众号,推送消息给用户
 */
public class ASubject extends Subject {
    @Override
    public void infrom(String news) {
        if (news == null) {
            news = "公众号暂无更新";
        }
        System.out.println("经济日报公众号开始推送消息：" + news);
        for (Observer observer : observers) {
            // 订阅者自动获取推送内容
            observer.update(news); // 这里是传递参数，还可以触发从数据库获取
        }
    }
}
