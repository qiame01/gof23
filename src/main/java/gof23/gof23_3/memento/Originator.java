package gof23.gof23_3.memento;

/**
 * 发起者角色：发起保存自己的状态
 */
public class Originator {
    // 攻击力
    private int attack;

    // 防御力
    private int defence;

    public Originator() {
    }

    public Originator(int attack, int defence) {
        this.attack = attack;
        this.defence = defence;
    }

    // 创建备忘录对象，即根据当前的发起者对象的状态得到一个包含相同状态值的 Memento 对象
    public Memento createMemento() {
        return new Memento(attack, defence);
    }

    // 从备忘录对象恢复原状态
    public void recoverFromMemento(Memento memento) {
        this.attack = memento.getAttack();
        this.defence = memento.getDefence();
    }

    // 显示当前游戏角色的状态（即各个属性值）
    public void display() {
        System.out.println(String.format("游戏角色当前的攻击力：%s，防御力：%s", attack, defence));
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

    @Override
    public String toString() {
        return "Originator{" +
                "attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
