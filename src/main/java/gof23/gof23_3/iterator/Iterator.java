package gof23.gof23_3.iterator;

/**
 * 迭代器接口，jdk里已经有了，这里是模仿jdk实现
 */
public interface Iterator {
    boolean hasNext();

    Object next();

    void remove();

}
