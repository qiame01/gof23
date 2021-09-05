package gof23.gof23_3.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器1
 */
public class BCollege implements College {

    List<Department> departments;
    int index = 0; // 数组需要num++，list不需要

    public BCollege() {
        departments = new ArrayList<>();
        add("a部门", "a部门描述");
        add("b部门", "b部门描述");
    }

    @Override
    public String getName() {
        return "BCollege学院";
    }

    @Override
    public void add(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public void remove() {
        // 容器和迭代器都可以有remove方法
    }

    @Override
    public Iterator iterator() {
        return new BIterator(departments);
    }
}
