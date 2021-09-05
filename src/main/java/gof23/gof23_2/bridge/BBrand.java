package gof23.gof23_2.bridge;

public class BBrand implements Brand {
    @Override
    public void open() {
        System.out.println("BBrand品牌的手机开机");
    }

    @Override
    public void call() {
        System.out.println("BBrand品牌的手机打电话");
    }

    @Override
    public void close() {
        System.out.println("BBrand品牌的手机关机");
    }
}
