package gof23.gof23_1.builder;

import org.junit.Test;

/**
 * 建造者模式：消费者调用指挥者D，D调用具体建造者A、B（A继承了抽象Builder），A完成产品的实例化、组装、返回。
 * 使用场景：建造者模式所创建的产品一般具有较多的共同点，其组成部分相似
 * 抽象建造者相当于蓝图，让子类具体实现。可任意增加新的具体建造者
 */
public class Consumer {

    /**
     * 实现方式1
     * 典型的建造者模式，包含角色：消费者、Director(指挥者)、抽象Builder、具体Builder1、具体Builder2、产品类
     * 指挥者指挥具体建造者，实例化、并组装产品
     */
    @Test
    public void test() {
        Director director = new Director();
        director.setStepA("AAA"); // 设置具体建造要求A
        director.setStepB("BBB");

        // 传入具体建造者。此外，若想获得不同需求的产品，只需传入新的建造者(如builderB)即可，且无需再次创建指挥者对象
        BuilderA builderA = new BuilderA();
        House house = director.build(builderA);
        System.out.println(house);

    }

    /**
     * 实现方式2
     * 建造者模式的简化版：有时用消费者直接替代Director(指挥者)，会更加灵活，但要记住有Director这个角色
     */
    @Test
    public void test2() {
        // 具体建造者A：默认套餐
        Builder builderA = new BuilderA();
        House house = builderA.getHouse();
        System.out.println(house);

        // 具体建造者B：自定义套餐 ==== 可任意增加新的具体建造者，而无需改变共同的建造过程
        Builder builderB = new BuilderB();
        builderB.stepA("刚开始打地基").stepB("正在混水泥"); // 链式编程。。这里stepA，原来在Director里build方法里
        House house1 = builderB.getHouse();
        System.out.println(house1);
    }

    /**
     * 实现方式3
     * 使用静态内部类方式：TODO 待整理 ================
     */
    @Test
    public void test3() {

    }

}
