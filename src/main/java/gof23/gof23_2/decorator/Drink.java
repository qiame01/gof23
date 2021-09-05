package gof23.gof23_2.decorator;

import java.math.BigDecimal;

/**
 * 这个接口，用于被装饰者类和被装饰者类这两个维度的类，共同实现
 */
public abstract class Drink {
    protected String des; // 描述
    private BigDecimal price = new BigDecimal(0.0);

    public String getDes() {
        return des + "：" + price + "元";
    }

    public void setDes(String des) {
        this.des = des;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public abstract BigDecimal cost();

}
