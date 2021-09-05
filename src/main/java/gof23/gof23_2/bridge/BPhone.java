package gof23.gof23_2.bridge;

public class BPhone extends Phone {

    public BPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        System.out.printf("BPhone类型、");
        super.open();
    }

    public void call() {
        System.out.printf("BPhone类型、");
        super.call();
    }

    public void close() {
        System.out.printf("BPhone、");
        super.close();
    }
}
