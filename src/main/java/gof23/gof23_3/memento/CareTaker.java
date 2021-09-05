package gof23.gof23_3.memento;

import java.util.List;
import java.util.Map;

/**
 * 管理者角色：管理 Memento 对象
 *
 * 有三种状态保存场景，因此有三种组合方式：
 * 1如果只管理一个游戏角色的一次状态，则只需组合一个 Memento
 * 2若管理一个游戏角色的多次状态，则需要组合 List<Memento>
 * 3若管理多个游戏角色的多次状态，则需要组合 Map<String, List<Memento>>
 */
public class CareTaker {

    // 1如果只管理一个游戏角色的一次状态，则只需组合一个 Memento
    private Memento memento;

    //2 若管理一个游戏角色的多次状态，则需要组合 List<Memento>
    private List<Memento> roleMementoList;

    // 3若管理多个游戏角色的多次状态，则需要组合 Map<String, List<Memento>>
    private Map<String, List<Memento>> roleListMementoList;

    // TODO 如果是上面其他两种状态保存场景，则这个对外方法要改造成从list或map里获取 Memento 对象，且参数是索引或者key+索引
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
