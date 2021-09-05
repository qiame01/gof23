package gof23.gof23_2.bridge;

/**
 * 行为接口的实现类，提供具体行为
 */
public class ABrand implements Brand {
    @Override
    public void open() {
        System.out.println("ABrand品牌的手机开机");
    }

    @Override
    public void call() {
        System.out.println("ABrand品牌的手机打电话");
    }

    @Override
    public void close() {
        System.out.println("ABrand品牌的手机关机");
    }
}
