package gof23.gof23_3.iterator;

/**
 * 具体容器1
 * 组合的数据容器可以使数组、list(list底层也是数组)
 */
public class ACollege implements College {

    Department[] departments;
    int num = 0; // 数组需要num++，list不需要

    public ACollege() {
        departments = new Department[2];
        add("c部门", "c部门描述");
        add("d部门", "d部门描述");
    }

    @Override
    public String getName() {
        return "ACollege学院";
    }

    @Override
    public void add(String name, String desc) {
        Department department = new Department(name, desc);
        departments[num] = department;
        num++;
    }

    @Override
    public void remove() {
        // 容器和迭代器都可以有remove方法
    }

    @Override
    public Iterator iterator() {
        return new AIterator(departments); // 返回迭代器时，需要将数据容器传过去
    }
}
