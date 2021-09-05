package gof23.gof23_2.bridge;

/**
 * 桥接类的子类，
 */
public class APhone extends Phone {

    public APhone(Brand brand) {
        super(brand);
    }

    public void open() {
        System.out.printf("APhone类型、");
        super.open();
    }

    public void call() {
        System.out.printf("APhone类型、");
        super.call();
    }

    public void close() {
        System.out.printf("APhone类型、");
        super.close();
    }
}
