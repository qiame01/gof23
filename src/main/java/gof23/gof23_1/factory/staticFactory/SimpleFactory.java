package gof23.gof23_1.factory.staticFactory;

import gof23.gof23_1.factory.Car;

public class SimpleFactory {

    // 方法一
    public static Car createCar(String name) {
        if ("ACar".equals(name)) {
            return new ACar();
        }else if ("BCar".equals(name)) {
            return new BCar();
        } else {
            return null;
        }
    }

    // 方法二
    public static Car getACar() {
        return new ACar();
    }
    public static Car getBCar() {
        return new BCar();
    }

}
