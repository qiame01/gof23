package gof23.gof23_1.builder;

public class Director {
    private String stepA = "aaa";
    private String stepB = "bbb";

    public House build(Builder builder) {
        builder.stepA(stepA);
        builder.stepB(stepB);
        return builder.getHouse();
    }

    public void setStepA(String stepA) {
        this.stepA = stepA;
    }

    public void setStepB(String stepB) {
        this.stepB = stepB;
    }

}
