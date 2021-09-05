package gof23.gof23_3.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 * 组合了一个观察者的list,并提供add、remove方法，还必须提供一个抽象的通知方法
 * 类似公众号接口
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void setNews(String news) {
        if (news == null){
            news = "公众号暂无更新";
        }
        // 若消息更新,则进行推送
        infrom(news);
    }

    public void add(Observer observer) {
        if (observers.contains(observer)) {
            return;
        }
        observers.add(observer);
    }

    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    public abstract void infrom(String aaa);
}
