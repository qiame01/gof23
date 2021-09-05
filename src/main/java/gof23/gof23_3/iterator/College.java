package gof23.gof23_3.iterator;

/**
 * 容器接口。其实现类里的容器，可以用数组或list（list底层也是数组）
 */
public interface College {
    String getName();

    void add(String name, String desc);

    void remove();

    Iterator iterator();
}
