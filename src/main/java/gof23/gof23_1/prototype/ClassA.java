package gof23.gof23_1.prototype;

import java.util.Date;

/**
 * 浅克隆
 */
public class ClassA implements Cloneable{

    private String aaa;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ClassA() {
    }

    public ClassA(String aaa, Date date) {
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
        return "ClassA{" +
                "aaa='" + aaa + '\'' +
                ", date=" + date +
                '}';
    }
}
