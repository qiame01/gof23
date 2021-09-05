package gof23.gof23_3.iterator;

/**
 * 迭代器接口的实现类1，类似jdk里的Iterable
 *
 */
public class AIterator implements Iterator {

    Department[] departments;
    int position = 0;

    public AIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        // 返回容器里的对象,并将指针后移一位
        Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public void remove() {

    }


}
