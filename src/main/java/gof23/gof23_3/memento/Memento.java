package gof23.gof23_3.memento;

/**
 * 备忘录角色：保存发起者对象的各种状态（状态即属性值）。备忘录角色里的属性一般与发起者属性相同
 */
public class Memento {
    // 攻击力
    private int attack;

    // 防御力
    private int defence;

    public Memento(int attack, int defence) {
        this.attack = attack;
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
