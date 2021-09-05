package gof23.gof23_3.iterator;

import java.util.List;

/**
 * 迭代器接口的实现类2，类似jdk里的Iterable
 *
 */
public class BIterator implements Iterator {

    List<Department> departments;
    int index = 0;

    public BIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() || departments.get(index) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments.get(index);
        index++;
        return department;
    }

    @Override
    public void remove() {

    }
}
