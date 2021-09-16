package gof23.gof23_1.factory;

import gof23.gof23_1.factory.abstractFactory.AFactory;
import gof23.gof23_1.factory.abstractFactory.BFactory;
import gof23.gof23_1.factory.factoryMethod.CCarFactory;
import gof23.gof23_1.factory.factoryMethod.DCarFactory;
import gof23.gof23_1.factory.staticFactory.SimpleFactory;
import org.junit.Test;

public class ClientCommonTest {

    /**
     * 简单工厂模式（静态工厂模式）：只有一个车工厂类，类中包含一个或多个接收参数并创建实例的静态方法
     * 优点：虽然不符合开闭原则，但是复杂度低，故在源码中大量使用存在。易开发，易维护
     * 缺点：需要修改原有工厂类代码（但由于具有上述优点，此模式依然受到极大欢迎和使用）
     */
    @Test
    public void test() {
        Car aCar = SimpleFactory.createCar("ACar");
//        Car aCar2 = SimpleFactory.getACar();
        aCar.sayHi();
    }

    /**
     * 工厂方法模式：依然由车工厂类去创建对象，只不过存在多个车工厂类（每个品牌的车，都有自己的车工厂类），每个车工厂类实现同一个车工厂类接口及其方法
     * 优点：符合开闭原则，无需修改原来代码
     * 缺点：新增文件多
     */
    @Test
    public void test2() {
        Car cCar = new CCarFactory().getCar();
        cCar.sayHi();
        Car dCar = new DCarFactory().getCar();
        dCar.sayHi();
    }

    /**
     * 抽象工厂模式：适用于产品族场景下的类实例化。特点：不可新增产品等级，即不可新增产品种类。只能新增一家公司（工厂），生产全部现有产品
     * 只适合增加新的产品族，比如新增一个苹果工厂A，A提供苹果手机、苹果电脑、苹果手表等类的实例化静态方法
     * <p>
     * 抽象工厂模式，实际是在工厂方法模式基础上进行了扩展：将工厂方法模式下的单个产品工厂接口扩展成了综合产品工厂接口A，
     * 同时在A中增加了新产品的获取方法，如在原有车的基础上新增了电脑，手机的获取方法。。。这样，一个工厂就能创建更多的产品（即一个产品族）
     */
    @Test
    public void test3() {

        new AFactory().getPhone().call();
        new AFactory().getRouter().net();
        new BFactory().getPhone().call();
        new BFactory().getRouter().net();

    }

}
