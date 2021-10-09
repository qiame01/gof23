package gof23.gof23_3.strategy;

import java.util.Map;

/**
 * 环境类
 * 环境类可以有一个或多个子类
 */
public class Context {
    private String name;
    private Strategy strategy;

    // todo 拓展：储存多个策略，根据传入的参数type，从map里取出对应的strategy（本例不涉及，自行探索）
    private Map<String, Strategy> strategyMap;

    public Context(String name) {
        this.name = name;
    }

    // set方法，用于切换不同的策略，重要
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 环境类次要方法
    void walk() {
        System.out.println("环境类次要方法：walk");
    }

    // 环境类核心方法
    public void contextHandle(String param) {
        System.out.println("这是" + name + "在操作---");
        System.out.println("环境类主要方法：contextHandle");
        this.walk();

        if (strategy != null) {
            strategy.handle(param);
        }
    }


}
