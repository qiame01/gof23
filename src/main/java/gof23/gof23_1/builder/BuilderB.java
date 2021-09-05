package gof23.gof23_1.builder;

/**
 * BuilderB：具体建造者B
 */
public class BuilderB extends Builder {

    private House house;

    public BuilderB() {
        house = new House();
    }

    @Override
    public Builder stepA(String need) {
        house.setNeedA(need);
        return this; // this指的是builder对象
    }

    @Override
    public Builder stepB(String need) {
        house.setNeedB(need);
        return this;
    }

    @Override
    House getHouse() {
        return house;
    }
}
