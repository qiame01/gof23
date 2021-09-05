package gof23.gof23_2.bridge;

/**
 * 桥接类
 * 在结构上组合了一个行为类对象Brand，以调用其行为方法
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }
}
