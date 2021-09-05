package gof23.gof23_1.factory.abstractFactory;

/**
 * 每个工厂提供多种产品的创建，实际是在工厂方法模式基础上进行的扩展
 */
public interface AbstractFactory {
    Phone getPhone();

    Router getRouter();
}
