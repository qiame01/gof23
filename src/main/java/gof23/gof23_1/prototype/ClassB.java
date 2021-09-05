package gof23.gof23_1.prototype;

import java.util.Date;

/**
 * 深克隆
 */
public class ClassB implements Cloneable{

    private String aaa;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ClassB clone = (ClassB)super.clone();
        // 深克隆：对对象属性也进行克隆，并重新赋值
        clone.date = (Date)this.date.clone();
        // clone.setDate((Date)this.date.clone()); // set赋值也可以哦
        return clone;
    }

    public ClassB() {
    }

    public ClassB(String aaa, Date date) {
        this.aaa = aaa;
        this.date = date;
    }

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "aaa='" + aaa + '\'' +
                ", date=" + date +
                '}';
    }
}
