package gof23.gof23_1.factory.staticFactory;

import gof23.gof23_1.factory.Car;

public class BCar implements Car {

    @Override
    public void sayHi() {
        System.out.println("BCar ===");
    }
}
