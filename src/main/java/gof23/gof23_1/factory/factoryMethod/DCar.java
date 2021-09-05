package gof23.gof23_1.factory.factoryMethod;

import gof23.gof23_1.factory.Car;

public class DCar implements Car {

    @Override
    public void sayHi() {
        System.out.println("DCar ===");
    }
}
