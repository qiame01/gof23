package gof23.gof23_3.strategy.strategy2;

/**
 * 环境类
 * 可以组合多种抽象策略：StrategySpeak、strategyFly
 * 初始化策略时，可以用构造器，也可以用set方法(推荐)
 */
public class Bird {
    private String name;
    private StrategySpeak strategySpeak;
    private StrategyFly strategyFly;

    public Bird(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("这是" + name + "--------");
        this.walk();
        this.speak();
        this.fly();
    }

    void walk() {
        System.out.println("散步");
    }

    void speak() {
        if (strategySpeak != null) {
            strategySpeak.speak();
        }
    }

    void fly() {
        if (strategyFly != null) {
            strategyFly.fly();
        }
    }

    public void setStrategySpeak(StrategySpeak strategySpeak) {
        this.strategySpeak = strategySpeak;
    }

    public void setStrategyFly(StrategyFly strategyFly) {
        this.strategyFly = strategyFly;
    }
}
