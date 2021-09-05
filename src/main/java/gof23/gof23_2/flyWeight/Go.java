package gof23.gof23_2.flyWeight;

/**
 * 享元接口/抽象类
 * 接口方法作用：设置和提供内部状态，设置外部状态
 */
public interface Go {

    String getColor();

    void display(Coordinate coordinate);

}
