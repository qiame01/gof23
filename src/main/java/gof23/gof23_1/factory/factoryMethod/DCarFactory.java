package gof23.gof23_1.factory.factoryMethod;

import gof23.gof23_1.factory.Car;

public class DCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new DCar();
    }
}
