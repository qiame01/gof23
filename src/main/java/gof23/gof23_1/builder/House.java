package gof23.gof23_1.builder;

public class House {
    private String needA = "铺砖完毕";
    private String needB = "砌墙进行中";

    public void setNeedA(String needA) {
        this.needA = needA;
    }

    public void setNeedB(String needB) {
        this.needB = needB;
    }

    public String toString() {
        return "Hourse{" +
                "needA='" + needA + '\'' +
                ", needB='" + needB + '\'' +
                '}';
    }
}
