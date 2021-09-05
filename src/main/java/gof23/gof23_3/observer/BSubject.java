package gof23.gof23_3.observer;

public class BSubject extends Subject {
    @Override
    public void infrom(String news) {
        if (news == null){
            news = "公众号暂无更新";
        }
        System.out.println("百度公众号开始推送消息：" + news);
        for (Observer observer : observers) {
            // 订阅者自动获取推送内容
            observer.update(news); // 这里是传递参数，还可以触发从数据库获取
        }
    }
}
