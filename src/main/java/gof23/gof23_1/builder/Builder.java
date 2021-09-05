package gof23.gof23_1.builder;

/**
 * Builder：相当于图纸
 */
public abstract class Builder {

    /**
     * 步骤A
     */
    abstract Builder stepA(String need);

    abstract Builder stepB(String need);

    /**
     * 返回产品
     */
    abstract House getHouse();
}
