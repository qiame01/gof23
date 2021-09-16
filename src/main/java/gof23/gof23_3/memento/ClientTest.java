package gof23.gof23_3.memento;

import org.junit.Test;

/**
 * 备忘录模式的核心：
 * 结构角色流程：备忘录模式的四大角色（对应四个类），注意其中管理者有三种状态保存场景（见CareTaker）
 * <p>
 * 使用场景：提供了可恢复状态的机制：存档、撤销操作、后退、后悔药等
 * 入门案例：游戏角色状态恢复
 * 优点：封装性好，隐藏内部实现细节
 * 缺点：如果类的属性过多，势必占用较大资源，且每次保存都会消耗一定内存
 * <p>
 * 备注：
 * 所谓状态即原对象的各个属性值
 * 备忘录角色里的属性一般与发起者属性相同
 * 备忘录模式可以叠加原型模式，以节省内存
 * 备忘录模式的简省用法（对某些角色类进行省略或简化）。如常用的：新建一个现有对象a的同类的对象b，并将a的状态（即属性值）set赋值给b
 */
public class ClientTest {

    @Test
    public void test() {

        // 初始化游戏角色(拓展：初始化可放在 Originator 里的 新建一个init方法里)
        Originator originator = new Originator();
        originator.setAttack(100);
        originator.setDefence(100);
        System.out.printf("和boss大战之前的状态：");
//        System.out.println("originator = " + originator); // TODO soutv和souf：快捷生成
        originator.display();

        // 保存游戏角色的当前状态（TODO 这里演示场景：单个角色的一次状态。list和map场景自行探索）
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        System.out.printf("和boss大战之后的状态：");
        originator.setAttack(30);
        originator.setDefence(40);
        originator.display();

        System.out.printf("和boss大战之后，使用备忘录恢复状态：");
        originator.recoverFromMemento(careTaker.getMemento());
        originator.display();

    }
}
